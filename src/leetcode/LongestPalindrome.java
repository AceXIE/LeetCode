/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: LongestPalindrome.java, v 0.1 2020-03-16 6:14 下午 xiekai.xk Exp $$
 */
public class LongestPalindrome {

    @Test
    public void test() {
        final int abccccdd = new Solution().longestPalindrome("abccccdd");
        System.out.println(abccccdd);
    }

    class Solution {
        public int longestPalindrome(String s) {
            int[] c = new int[58];
            final char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                c[chars[i]-'A']++;
            }
            int res = 0;
            for (int i = 0; i < c.length; i++) {
                res += (c[i]/2)*2;
            }
            if (res<s.length()) {
                res++;
            }
            return res;
        }
    }
}