/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: DeleteDuplicates.java, v 0.1 2019-10-27 5:05 PM xiekai.xk Exp $$
 */
public class DeleteDuplicates {


    @Test
    public void deleteDuplicates() {
        ListNode h = new ListNode(1);

        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(4);
        h.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = null;

        Solution s = new Solution();

        ListNode listNode = s.deleteDuplicates(h);

        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return head;
            ListNode l = head;

            while (l != null && l.next != null) {
                if (l.val != l.next.val) {
                    l = l.next;
                } else {
                    l.next = l.next.next;
                }
            }
            return head;

        }
    }
}