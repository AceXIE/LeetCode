/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/distribute-candies-to-people/comments/
 * @author xiekai.xk
 * @version $Id: DistributeCandies.java, v 0.1 2020-03-05 12:30 下午 xiekai.xk Exp $$
 */
public class DistributeCandies {


    @Test
    public void test() {
        final int[] ints = new Solution().distributeCandies(7, 4);
        Arrays.stream(ints).forEach(System.out::println);
    }



    class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            int[] res = new int[num_people];
            int cur = 1;
            while (candies > 0) {
                for (int i = 0; i < res.length && candies > 0; i++) {
                    res[i] += Math.min(cur, candies);
                    candies -= cur;
                    cur++;
                }
            }

            return res;
        }
    }
}