/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: CountAndSay.java, v 0.1 2019-10-27 2:20 PM xiekai.xk Exp $$
 */
public class CountAndSay {

    @Test
    public void testContAndSay() {
        System.out.println();
        int N = 3;

        String line = "21";

        for (int i = 0; i < N; i++) {
            line = countAndSayNext(line);
        }
        System.out.println(line);

    }

    private String countAndSayNext(String line) {

        int i = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();

        while (i < line.length()) {
            System.out.println(line.charAt(i));
            if (i == 0 || line.charAt(i) == line.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(line.charAt(i - 1));
                count = 1;
            }
            if (i == line.length() - 1) {
                sb.append(count).append(line.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }
}