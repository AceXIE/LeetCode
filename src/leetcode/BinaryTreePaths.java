/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import leetcode.util.TreeNodeUtil;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author xiekai.xk
 * @version $Id: BinaryTreePaths.java, v 0.1 2020-01-05 2:49 下午 xiekai.xk Exp $$
 */
public class BinaryTreePaths {

    @Test
    public void test() {
        List<String> strings = new Solution().binaryTreePaths(TreeNodeUtil.init());
        strings=null;
        if (strings.stream().anyMatch(s -> "1->2".equals(s))) {
            System.out.println(1);
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }

    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> p = new LinkedList<>();
            helper(root, "",p);
            return p;
        }

        public void helper(TreeNode node, String path, List<String> paths) {
            if (node != null) {
                path += node.val;
                if (node.left == null && node.right == null) {
                    paths.add(path);
                } else {
                    path += "->";
                    helper(node.left, path, paths);
                    helper(node.right, path, paths);
                }
            }
        }
    }
}