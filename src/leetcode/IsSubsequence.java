/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/is-subsequence/
 * @author xiekai.xk
 * @version $Id: IsSubsequence.java, v 0.1 2020-03-01 3:03 下午 xiekai.xk Exp $$
 */
public class IsSubsequence {

    @Test
    public void test() {
        System.out.println(new Solution().isSubsequence("adc", "adecfc"));
    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {
            final char[] chars = s.toCharArray();
            int          k     = -1;
            for (char aChar : chars) {
                k = t.indexOf(aChar, k + 1);
                if (k == -1) {
                    return false;
                }
            }
            return true;
        }
    }

}
