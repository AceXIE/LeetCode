/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 *
 * @author xiekai.xk
 * @version $Id: ReverseInteger.java, v 0.1 2019-05-26 4:01 PM xiekai.xk Exp $$
 */
public class ReverseInteger {

    public static void main(String[] args) {
        final int reverse = reverse(-1230);
        System.out.println(reverse);

    }

    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (Math.abs(res) > Integer.MAX_VALUE / 10) { return 0; }
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res;

    }
}