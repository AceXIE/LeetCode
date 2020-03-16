/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: ToHex.java, v 0.1 2020-03-16 4:52 下午 xiekai.xk Exp $$
 */
public class ToHex {


    @Test
    public void test() {
        final String s = new Solution().toHex(-1);
        System.out.println(s);
    }

    class Solution {
        public String toHex(int num) {
            if(num == 0) return "0";
            String s = "0123456789abcdef";
            String ans="";
            while (num!=0 && ans.length() < 8) {
                ans = s.charAt(num & 0xf) + ans;
                num>>=4;
            }
            return ans;
        }
    }
}