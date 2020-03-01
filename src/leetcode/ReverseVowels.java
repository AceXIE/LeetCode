package leetcode; /**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: ReverseVowels.java, v 0.1 2020-02-23 4:32 下午 xiekai.xk Exp $$
 */
public class ReverseVowels {

    @Test
    public void reTest() {
        System.out.println(new Solution().reverseVowels("leetcode"));
    }

    class Solution {
        public String reverseVowels(String s) {

            if (s == null || s.length() < 2) {
                return s;
            }
            final char[] chars = s.toCharArray();
            String ss = "aeiouAEIOU";
            int    l  = 0, r = s.length() - 1;
            char tmp;
            while (l < r) {
                while (ss.indexOf(chars[l]) == -1) {
                    l++;
                }
                while (ss.indexOf(chars[r]) == -1) {
                    r--;
                }
                if (l < r) {
                    tmp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = tmp;
                    l++;
                    r--;
                }
            }
            return String.valueOf(chars);
        }
    }
}