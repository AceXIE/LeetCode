/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author xiekai.xk
 * @version $Id: KuoHaoisValid.java, v 0.1 2019-09-24 11:05 PM xiekai.xk Exp $$
 */
public class KuoHaoisValid {

    @Test
    public void isValid() {
        String s = "([]";
        boolean isValid = false;

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        if (s == null || s.length() == 0) {
            isValid = false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    isValid = false;
                    break;
                }
                final char pop = stack.pop();
                isValid = (pop == map.get(c));
                if (!isValid) {
                    break;
                }
            }
        }
        if (!stack.empty()) {
            isValid = false;
        }
        System.out.println(isValid);

    }
}