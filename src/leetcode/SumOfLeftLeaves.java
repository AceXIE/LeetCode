/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import leetcode.util.TreeNodeUtil;
import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/sum-of-left-leaves/
 * @author xiekai.xk
 * @version $Id: SumOfLeftLeaves.java, v 0.1 2020-03-01 3:42 下午 xiekai.xk Exp $$
 */
public class SumOfLeftLeaves {

    @Test
    public void test() {
        final TreeNode init = TreeNodeUtil.init();
        System.out.println(new Solution().sumOfLeftLeaves(init));
    }

    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            int res = 0;
            if (root == null) {
                return 0;
            }
            if (root.left != null && root.left.left == null && root.left.right ==null) {
                res += root.left.val;
            }
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right) + res;
        }
    }

}