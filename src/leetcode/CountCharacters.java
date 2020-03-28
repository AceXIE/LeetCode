/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 *给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 * 示例 2：
 *
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author xiekai.xk
 * @version $Id: CountCharacters.java, v 0.1 2020-03-17 8:59 下午 xiekai.xk Exp $$
 */
public class CountCharacters {

    @Test
    public void test() {
        String    chars = "atach";
        String[]  words = new String[] {"cat", "bt", "hat", "tree"};
        final int i     = new Solution().countCharacters(words, chars);
        System.out.println(i
        );
    }

    class Solution {
        public int countCharacters(String[] words, String chars) {
            int[] ch = new int[58];
            for (int i = 0; i < chars.length(); i++) {
                ch[chars.charAt(i) - 'a']++;
            }
            int   res = 0;
            int[] tt  = new int[26];
            for (String word : words) {
                Arrays.fill(tt, 0);
                boolean check = true;
                for (int i = 0; i < word.length() && check; i++) {
                    final char c  = word.charAt(i);
                    tt[c - 'a']++;
                    if (tt[c - 'a'] > ch[c - 'a']) {
                        check = false;
                    }
                }
                res += check ? word.length() : 0;
            }
            return res;

        }
    }
}