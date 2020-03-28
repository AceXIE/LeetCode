/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 动态规划 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
 * @author xiekai.xk
 * @version $Id: MaxProfit.java, v 0.1 2020-03-09 9:47 上午 xiekai.xk Exp $$
 */
public class MaxProfit {
    @Test
    public void test() {
        //int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        int[] prices = new int[] {7,6,4,3,1};
        System.out.println(new Solution().maxProfit(prices));
    }

    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length < 2) return 0;
            int[] dp = new int[prices.length];

            int min = prices[0];
            dp[0] = 0;
            for (int i = 1; i < dp.length; i++) {
                min = Math.min(min, prices[i - 1]);
                dp[i] = Math.max(dp[i - 1], prices[i] - min);
            }
            return dp[dp.length - 1];

        }
    }

}