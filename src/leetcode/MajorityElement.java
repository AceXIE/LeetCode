/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/majority-element/
 * @author xiekai.xk
 * @version $Id: MajorityElement.java, v 0.1 2020-03-13 6:05 下午 xiekai.xk Exp $$
 */
public class MajorityElement {

    @Test
    public void test() {
        int[] nums = new int[]{3,2,3};
        final int i = new Solution().majorityElement(nums);
        System.out.println(i);
    }

    class Solution {
        public int majorityElement(int[] nums) {
            int                   len = nums.length;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                Integer orDefault = map.getOrDefault(nums[i], 0);
                orDefault++;
                map.put(nums[i], orDefault);
            }
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (m.getValue() > len / 2) {
                    return m.getKey();
                }
            }
            return 0;
        }
    }
}