/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: MaxSubArray.java, v 0.1 2019-10-27 3:23 PM xiekai.xk Exp $$
 */
public class MaxSubArray {

    @Test
    public void maxSubArray() {
        Solution solution = new Solution();
        final int i = solution.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
        System.out.println(i);
    }

    class Solution {
        public int maxSubArray(int[] nums) {
            int res = Integer.MIN_VALUE;
            int f = 0;
            for (int i = 0; i < nums.length; i++) {
                f = Math.max(nums[i], f + nums[i]);
                res = Math.max(f, res);
            }
            return res;
        }
    }
}