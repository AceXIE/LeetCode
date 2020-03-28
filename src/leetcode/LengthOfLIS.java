/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 * 示例:
 *
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * 说明:
 *
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。
 * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
 *
 * @author xiekai.xk
 * @version $Id: LengthOfLIS.java, v 0.1 2020-03-14 4:54 下午 xiekai.xk Exp $$
 */
public class LengthOfLIS {

    @Test
    public void test() {
        int[]     nums = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
        final int i    = new Solution().lengthOfLIS(nums);
        System.out.println(i);
    }

    class Solution {
        public int lengthOfLIS(int[] nums) {
            if (nums.length == 0) { return 0; }
            int[] dp = new int[nums.length];
            dp[0] = 1;
            int res = 1;
            for (int i = 1; i < dp.length; i++) {
                int mx = 0;
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        mx = Math.max(mx, dp[j]);
                    }
                }
                dp[i] = mx + 1;
                res = Math.max(res, dp[i]);
            }
            return res;

        }
    }
}