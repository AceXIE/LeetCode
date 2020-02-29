/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: IsSymmetric.java, v 0.1 2019-11-04 10:18 PM xiekai.xk Exp $$
 */
public class IsSymmetric {

    @Test
    public void isSym() {

        TreeNode left  = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root  = new TreeNode(1);
        root.left = left;
        root.right = right;

        Solution solution = new Solution();
        final boolean symmetric = solution.isSymmetric(root);
        System.out.println(symmetric);

    }
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root == null) return true;

            return isSy(root.left, root.right);
        }

        private boolean isSy(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }

            return isSy(left.left, right.right) && isSy(left.right, right.left);

        }
    }




}