/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author xiekai.xk
 * @version $Id: FindContinuousSequence.java, v 0.1 2020-03-06 8:48 下午 xiekai.xk Exp $$
 */
public class FindContinuousSequence {

    @Test
    public void test() {
        final int[][] continuousSequence = new Solution().findContinuousSequence(9);
        for (int i = 0; i < continuousSequence.length; i++) {
            for (int j = 0; j < continuousSequence[i].length; j++) {
                System.out.println(continuousSequence[i][j]);
            }
        }
    }

    class Solution {
        public int[][] findContinuousSequence(int target) {
            List<int[]> res = new ArrayList<>();

            for (int l = 1, r = 1, sum = 0; r < target; r++) {
                sum += r;
                while (sum>target) {
                    sum-=l;
                    l++;
                }
                if (sum == target) {
                    int[] t = new int[r-l+1];
                    for (int i = 0; i < t.length; i++) {
                        t[i] = l+i;
                    }
                    res.add(t);
                }
            }
            int[][] ints = new int[res.size()][];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = res.get(i);
            }
            return ints;

        }
    }
}