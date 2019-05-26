/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import org.testng.annotations.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: PalindromeNumber.java, v 0.1 2019-05-26 7:11 PM xiekai.xk Exp $$
 */
public class PalindromeNumber {

    @Test
    public void test() {
        final boolean palindrome = isPalindrome(1000000001);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x) {
        int y = 0;
        if (x < 0) { return false; }
        int xx = x;
        while (xx != 0) {
            if (y > Integer.MAX_VALUE / 10) { return false; }
            y = y * 10 + xx % 10;
            xx = xx / 10;
        }

        return y == x;

    }
}