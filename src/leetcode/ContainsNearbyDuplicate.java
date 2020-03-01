/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author xiekai.xk
 * @version $Id: ContainsNearbyDuplicate.java, v 0.1 2019-11-30 11:55 AM xiekai.xk Exp $$
 */
public class ContainsNearbyDuplicate {


    @Test
    public void containsNearbyDuplicate() {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(new Solution().containsNearbyDuplicate(nums, 3));
    }

    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {

            if (nums == null) return false;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) return true;
                set.add(nums[i]);
                if (set.size() > k)
                    set.remove(nums[i-k]);
            }
            return false;

        }
    }
}