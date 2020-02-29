/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author xiekai.xk
 * @version $Id: LevelOrderBottom.java, v 0.1 2019-11-12 10:40 PM xiekai.xk Exp $$
 */
public class LevelOrderBottom {

    @Test
    public void test() {

        TreeNode left  = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root  = new TreeNode(1);
        root.left = left;
        root.right = right;

        Solution solution = new Solution();
        final List<List<Integer>> lists = solution.levelOrderBottom(root);
        System.out.println(lists);

    }

    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            LinkedList<List<Integer>> res = new LinkedList<>();
            if (root == null)
                return res;
            Queue<TreeNode> queue = new LinkedList<>();

            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> tmp = new ArrayList<>();

                final int size = queue.size();
                for (int i = 0; i < size; i++) {
                    final TreeNode poll = queue.poll();
                    tmp.add(poll.val);
                    if (poll.left != null)
                        queue.offer(poll.left);
                    if (poll.right != null)
                        queue.offer(poll.right);
                }
                res.addFirst(tmp);
            }
            return res;

        }
    }

}