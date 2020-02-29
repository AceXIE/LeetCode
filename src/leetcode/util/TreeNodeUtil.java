/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode.util;

import leetcode.TreeNode;

/**
 *
 * @author xiekai.xk
 * @version $Id: ListNodeUtil.java, v 0.1 2019-11-18 4:33 PM xiekai.xk Exp $$
 */
public class TreeNodeUtil {

    /**
     *    1
     *  /   \
     * 2     3
     *  \
     *   5
     * @return
     */
    public static TreeNode init() {
        TreeNode head1 = new TreeNode(1);
        TreeNode head2 = new TreeNode(2);
        TreeNode head3 = new TreeNode(3);
        TreeNode head5 = new TreeNode(5);

        head1.left = head2;
        head1.right = head3;
        head2.right = head5;

        return head1;
    }

}