/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xiekai.xk
 * @version $Id: IsIsomorphic.java, v 0.1 2019-11-18 2:56 PM xiekai.xk Exp $$
 */
public class IsIsomorphic {

    class Solution {
        public boolean isIsomorphic(String s, String t) {

            if (s.length() != t.length()) return false;
            Map<Character, Character> map = new HashMap<>();

            final int N = s.length();
            for (int i = 0; i < N; i++) {
                final char c = s.charAt(i);
                if (map.containsKey(c)) {
                    final Character tag = map.get(c);

                    if (tag != t.charAt(i)) {
                        return false;
                    }
                } else {
                    if (map.containsValue(t.charAt(i))) {
                        return false;
                    }
                    map.put(c, t.charAt(i));
                }
            }
            return true;

        }
    }
}