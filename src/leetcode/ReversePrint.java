/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * @author xiekai.xk
 * @version $Id: ReversePrint.java, v 0.1 2020-03-29 8:52 下午 xiekai.xk Exp $$
 */
public class ReversePrint {




    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode root = head;
            Stack<Integer> stack = new Stack<>();
            while (root != null) {
                stack.push(root.val);
                root = root.next;
            }
            int[] res = new int[stack.size()];
            for (int i = 0; i < res.length; i++) {
                res[i] = stack.pop();
            }
            return res;
        }
    }
}