/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: IsHappy.java, v 0.1 2019-11-17 4:50 PM xiekai.xk Exp $$
 */
public class IsHappy {

    @Test
    public void isHappy () {
        Solution s = new Solution();

        System.out.println(s.isHappy(19));
    }


    class Solution {
        public boolean isHappy(int n) {
            int fast = n;
            int slow = n;

            do {
                fast = getNext(fast);
                fast = getNext(fast);
                slow = getNext(slow);
            } while (fast != slow);


            return fast == 1;
        }

        private int getNext(int fast) {
            int res = 0;

            while (fast > 0) {
                final int i = fast % 10;
                res += i*i;
                fast = fast / 10;
            }

            return res;
        }

    }

}