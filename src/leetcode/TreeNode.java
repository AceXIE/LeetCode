/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

/**
 *
 * @author xiekai.xk
 * @version $Id: TreeNode.java, v 0.1 2019-11-04 10:18 PM xiekai.xk Exp $$
 */
public class TreeNode {

    public int      val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }

    public static void print(TreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.val + ",");
            print(root.right);
        }
    }

    /**
     * Getter method for property val.
     *
     * @return property value of val
     */

    public int getVal() {
        return val;
    }

    /**
     * Setter method for property counterType.
     *
     * @param val value to be assigned to property val
     */

    public void setVal(int val) {
        this.val = val;
    }

    /**
     * Getter method for property left.
     *
     * @return property value of left
     */

    public TreeNode getLeft() {
        return left;
    }

    /**
     * Setter method for property counterType.
     *
     * @param left value to be assigned to property left
     */

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * Getter method for property right.
     *
     * @return property value of right
     */

    public TreeNode getRight() {
        return right;
    }

    /**
     * Setter method for property counterType.
     *
     * @param right value to be assigned to property right
     */

    public void setRight(TreeNode right) {
        this.right = right;
    }
}