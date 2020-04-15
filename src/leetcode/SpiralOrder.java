/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author xiekai.xk
 * @version $Id: SpiralOrder.java, v 0.1 2020-04-14 10:43 下午 xiekai.xk Exp $$
 */
public class SpiralOrder {
    @Test
    public void test() {
        int[][]     ma   = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        final int[] ints = new Solution().spiralOrder(ma);
        System.out.println(ints);
    }

    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix == null) { return null; }
            int   m   = matrix.length - 1, n = matrix[0].length - 1;
            int   rl  = 0, rh = m, cl = 0, ch = n;
            int[] res = new int[(m + 1) * (n + 1)];
            int   idx = 0;
            while (true) {
                for (int i = cl; i <= ch; i++) {
                    res[idx++] = matrix[rl][i];
                }
                if (++rl > rh) { break; }
                for (int i = rl; i <= rh; i++) { res[idx++] = matrix[i][ch]; }
                if (--ch < cl) { break; }
                for (int i = ch; i >= cl; i--) { res[idx++] = matrix[rh][i]; }
                if (--rh < rl) { break; }
                for (int i = rh; i >= rl; i--) { res[idx++] = matrix[i][cl]; }
                if (++cl > ch) { break; }
            }
            return res;
        }
    }
}