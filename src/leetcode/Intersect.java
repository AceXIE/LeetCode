/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * @author xiekai.xk
 * @version $Id: Intersect.java, v 0.1 2020-02-29 2:45 下午 xiekai.xk Exp $$
 */
public class Intersect {

    @Test
    public void test() {
        int[]       nums1     = new int[] {1, 2, 2, 3, 1};
        int[]       nums2     = new int[] {2, 2};
        final int[] intersect = new Solution().intersect(nums1, nums2);
        Arrays.stream(intersect).forEach(System.out::println);
    }

    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {

            if (nums1.length > nums2.length) {
                return intersect(nums2, nums1);
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : nums1) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            int k = 0;
            for (int i : nums2) {
                if (map.getOrDefault(i, 0) > 0) {
                    nums1[k++] = i;
                    map.put(i, map.get(i) - 1);

                }
            }
            return Arrays.copyOfRange(nums1, 0, k);
        }
    }

}