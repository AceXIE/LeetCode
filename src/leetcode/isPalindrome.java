/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import leetcode.util.ListNodeUtil;
import org.junit.Test;

import java.util.Stack;

/**
 * 请判断一个链表是否为回文链表。
 * @author xiekai.xk
 * @version $Id: isPalindrome.java, v 0.1 2019-11-30 3:54 PM xiekai.xk Exp $$
 */
public class isPalindrome {

    @Test
    public void test() {
        ListNode h = ListNodeUtil.init();
        System.out.println(new Solution().isPalindrome(h));
    }



    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return false;
            ListNode slow = head, fast = head;
            Stack<Integer> stack = new Stack<>();

            while (fast != null) {
                stack.add(slow.val);
                slow = slow.next;
                fast = fast.next==null?fast.next:fast.next.next;
            }
            ListNode pre = null, next = slow.next;

            while (slow !=null) {
                next = slow.next;
                slow.next = pre;
                pre = slow;
                slow = next;
            }
            while (slow != null && head != null) {
                if (slow.val != head.val) {
                    return false;
                }
                slow = slow.next;
                head = head.next;
            }
            return true;
        }
    }
}