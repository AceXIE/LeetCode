/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: L26RemoveDuplicates.java, v 0.1 2019-09-26 11:46 PM xiekai.xk Exp $$
 */
public class L26RemoveDuplicates {

    @Test
    public void testRem() {


        Solution solution = new Solution();

        int[] nums = new int[]{0,0,1,2,3,3};

        System.out.println(solution.removeDuplicates(nums));

    }

}

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 1) return nums.length;

        int i=1;

        for (int k = 1; k < nums.length; k++) {
            if (nums[k-1] != nums[k]) {
                nums[i] = nums[k];
                i++;
            }
        }
        return i;
    }
}