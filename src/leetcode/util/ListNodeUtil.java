/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode.util;

import leetcode.ListNode;

/**
 *
 * @author xiekai.xk
 * @version $Id: ListNodeUtil.java, v 0.1 2019-11-18 4:33 PM xiekai.xk Exp $$
 */
public class ListNodeUtil {

    public static ListNode init() {
        ListNode head  = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(1);
        head.next = head1;
        head1.next = head3;
        head2.next = head3;
        head3.next = head4;
        head4.next = null;

        return head;
    }


    public static void scan(ListNode head) {
        while (head != null) {
            System.err.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }
}