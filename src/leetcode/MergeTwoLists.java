/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: MergeTwoLists.java, v 0.1 2019-09-25 10:57 PM xiekai.xk Exp $$
 */
public class MergeTwoLists {

    @Test
    public void testMerge() {
        ListNode l1 = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        l1.next = a;
        a.next = b;
        b.next = null;
        ListNode l2 = new ListNode(1);
        ListNode c = new ListNode(4);
        l2.next = c;
        c.next = null;

        Solution solution = new Solution();

        ListNode res = solution.mergeTwoLists(l1, l2);

        while (res != null) {
            System.out.print(res.val+"->");
            res = res.next;
        }

    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            if (l1 == null) return l2;
            if (l2 == null) return l1;

            ListNode tmp = new ListNode(-1);
            ListNode res = tmp;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    tmp.next = l1;
                    l1 = l1.next;
                } else {
                    tmp.next = l2;
                    l2 = l2.next;
                }
                tmp = tmp.next;
            }
            if (l1 != null) {
                tmp.next = l1;
            } else {
                tmp.next = l2;
            }
            return res.next;

        }
    }

}