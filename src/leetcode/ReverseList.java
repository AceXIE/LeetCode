/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import leetcode.util.ListNodeUtil;
import org.junit.Test;

/**
 * 206. 反转链表
 * @author xiekai.xk
 * @version $Id: ReverseList.java, v 0.1 2019-11-18 3:10 PM xiekai.xk Exp $$
 */
public class ReverseList {

    @Test
    public void test() {
        final ListNode head = ListNodeUtil.init();
        //ListNodeUtil.scan(head);
        final ListNode listNode = new Solution().reverseList(head);
        ListNodeUtil.scan(listNode);
    }


    class Solution {
        public ListNode reverseList(ListNode head) {


            ListNode pre = null;
            ListNode cur = head;

            while (cur != null) {
                ListNode tmp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = tmp;
            }
            return pre;
        }
    }
}