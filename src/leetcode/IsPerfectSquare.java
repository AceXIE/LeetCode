/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/valid-perfect-square/
 * @author xiekai.xk
 * @version $Id: IsPerfectSquare.java, v 0.1 2020-02-29 3:36 下午 xiekai.xk Exp $$
 */
public class IsPerfectSquare {

    @Test
    public void test() {
        System.out.println(new Solution().isPerfectSquare(16));
    }

    class Solution {
        public boolean isPerfectSquare(int num) {
            if (num < 4) { return false; }
            long l = 2, r = num / 2;
            while (l <= r) {
                long mid = l + (r - l) / 2;
                if (mid * mid == num) {
                    return true;
                } else if (mid * mid < num) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return false;
        }
    }
}