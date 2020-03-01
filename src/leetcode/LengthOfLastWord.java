/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: LengthOfLastWord.java, v 0.1 2019-10-27 3:28 PM xiekai.xk Exp $$
 */
public class LengthOfLastWord {
    @Test
    public void lengthOfLastWord() {

        Solution s = new Solution();
        final int he_he_word = s.lengthOfLastWord("VPtCBexbhyOqEHWMpF  VJOZpC");
        System.out.println(he_he_word);
    }

    class Solution {
        public int lengthOfLastWord(String s) {
            final String trim = s.trim();
            StringBuilder sb = new StringBuilder();
            for (int i = trim.length() - 1; i >= 0; i--) {
                final char c = trim.charAt(i);
                if (c != ' ') {
                    sb.append(c);
                }
                if (c == ' ' || i == 0) {
                    if (isWorld(sb.toString())) {
                        return sb.toString().length();
                    } else {
                        sb = new StringBuilder();
                    }
                }
            }
            return 0;
        }

        private boolean isWorld(String s) {
            for (int i = 0; i < s.length(); i++) {
                final char c = s.charAt(i);
                if ((c <= 'Z' && c >= 'A')|| (c <='z'&& c>='a')) {
                    continue;
                }
                return false;
            }
            return true;
        }

    }
}