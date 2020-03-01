/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author xiekai.xk
 * @version $Id: MyStack.java, v 0.1 2019-11-30 1:28 PM xiekai.xk Exp $$
 */
public class MyStack {

    private Queue<Integer> queue;
    private Queue<Integer> queue1;
    private Integer top;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        queue1 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (queue.size() > 1) {
            top = queue.poll();
            queue1.add(top);
        }

        final Integer top1 = queue.poll();
        queue = queue1;
        queue1 = new LinkedList<>();
        return top1;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

    @Test
    public void test() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}