/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 *
 * 返回使 A 中的每个值都是唯一的最少操作次数。
 *
 * 示例 1:
 *
 * 输入：[1,2,2]
 * 输出：1
 * 解释：经过一次 move 操作，数组将变为 [1, 2, 3]。
 * 示例 2:
 *
 * 输入：[3,2,1,2,1,7]
 * 输出：6
 * 解释：经过 6 次 move 操作，数组将变为 [3, 4, 1, 2, 5, 7]。
 * 可以看出 5 次或 5 次以下的 move 操作是不能让数组的每个值唯一的。
 * 提示：
 *
 * 0 <= A.length <= 40000
 * 0 <= A[i] < 40000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author xiekai.xk
 * @version $Id: MinIncrementForUnique.java, v 0.1 2020-03-22 10:36 上午 xiekai.xk Exp $$
 */
public class MinIncrementForUnique {
    @Test
    public void test() {
        final int i = new Solution().minIncrementForUnique(new int[] {3, 2, 1, 2, 1, 7});
        System.out.println(i);
    }

    class Solution {
        public int minIncrementForUnique(int[] A) {
            Arrays.sort(A);
            int ans = 0;
            for (int i = 1; i < A.length; i++) {

                if (A[i] <= A[i-1]) {
                    int cur = A[i];
                    A[i] = A[i-1]+1;
                    ans += A[i]-cur;
                }
            }
            return ans;
        }
    }

}