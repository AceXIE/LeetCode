/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/third-maximum-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author xiekai.xk
 * @version $Id: ThirdMax.java, v 0.1 2020-03-21 9:48 下午 xiekai.xk Exp $$
 */
public class ThirdMax {

    @Test
    public void test() {
        final int i = new Solution().thirdMax(new int[] {1, 2, 2});
        System.out.println(i);
    }

    class Solution {
        public int thirdMax(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            if (nums.length == 2) {
                return Math.max(nums[0], nums[1]);
            }

            int     max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
            int     time = 0;
            boolean f    = true;
            for (final int cur : nums) {
                if (cur == Integer.MIN_VALUE && f) {
                    time++;
                    f = false;
                }
                if (cur > max1) {
                    time++;
                    max3 = max2;
                    max2 = max1;
                    max1 = cur;
                } else if (cur > max2 && cur < max1) {
                    time++;
                    max3 = max2;
                    max2 = cur;
                } else if (cur > max3 && cur < max2) {
                    time++;
                    max3 = cur;
                }
            }

            return time >= 3 ? max3 : max1;
        }
    }
}