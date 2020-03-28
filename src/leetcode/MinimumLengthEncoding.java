/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
 *
 * 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
 *
 * 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
 *
 * 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
 *
 *  
 *
 * 示例：
 *
 * 输入: words = ["time", "me", "bell"]
 * 输出: 10
 * 说明: S = "time#bell#" ， indexes = [0, 2, 5] 。
 *  
 *
 * 提示：
 *
 * 1 <= words.length <= 2000
 * 1 <= words[i].length <= 7
 * 每个单词都是小写字母 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/short-encoding-of-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author xiekai.xk
 * @version $Id: MinimumLengthEncoding.java, v 0.1 2020-03-28 1:15 下午 xiekai.xk Exp $$
 */
public class MinimumLengthEncoding {

    @Test
    public void test() {
        String[] words = {"time", "me", "bell"};
        final int i    = new Solution().minimumLengthEncoding(words);
        System.out.println(i);
    }

    class Solution {
        public int minimumLengthEncoding(String[] words) {
            Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());
            int  len  = 0;
            Trie root = new Trie();
            for (String word : words) {
                len += root.insert(word);
            }
            return len;
        }
    }

    private class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }
        public int insert(String word) {
            TrieNode cur = root;
            boolean isNew =false;
            for (int i = word.length() - 1; i >=0; i--) {
                final int i1 = word.charAt(i) - 'a';
                if (cur.children[i1] == null) {
                    isNew = true;
                    cur.children[i1] = new TrieNode();
                }
                cur = cur.children[i1];
            }
            return isNew?word.length()+1:0;
        }
    }

    private class TrieNode {
        char val;

        TrieNode[] children = new TrieNode[26];

        public TrieNode() {
        }
    }

}