/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/sorted-merge-lcci/
 * @author xiekai.xk
 * @version $Id: Merge.java, v 0.1 2019-10-30 10:19 PM xiekai.xk Exp $$
 */
public class Merge {

    @Test
    public void merge() {
        Solution solution = new Solution();

        int[] nums1 = new int[8];
        nums1[0] = 2;
        //nums1[1] = 2;
        //nums1[2] = 3;

        int[] nums2 = new int[] { 2 };

        solution.merge(nums1, 1, nums2, nums2.length);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

    }

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            if (n == 0)
                return;
            if (m == 0) {
                nums1 = nums2;
                return;
            }

            int i = m + n - 1;
            int p1 = m - 1;
            int p2 = n - 1;
            while (p1 >= 0 && p2 >= 0) {
                nums1[i--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
            }
            while (p2 >= 0) {
                nums1[i--] = nums2[p2--];
            }
        }
    }

}