/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import java.util.Stack;

/**
 *
 * @author xiekai.xk
 * @version $Id: MyQueue.java, v 0.1 2019-11-30 2:32 PM xiekai.xk Exp $$
 */
public class MyQueue {

    private Stack<Integer> stack;
    private Stack<Integer> stack1;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
        stack1 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        while (stack.size() > 1) {
            final Integer top = stack.pop();
            stack1.add(top);
        }
        final Integer pop = stack.pop();
        stack = stack1;
        stack1 = new Stack<>();
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        while (stack.size() > 1) {
            final Integer top = stack.pop();
            stack1.add(top);
        }final Integer pop = stack.pop();
        stack1.add(pop);
        stack = stack1;
        stack1 = new Stack<>();
        return pop;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }

}