/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author xiekai.xk
 * @version $Id: LongestCommonPrefix.java, v 0.1 2019-09-14 3:00 PM xiekai.xk Exp $$
 */
public class LongestCommonPrefix {

    @Test
    public void longestCommonPrefix() {
        //String[] strs = {"flower","flow","flight"};
        String[] strs = {"c","c"};

        final List<String> list = Arrays.asList(strs);
        if (list.size() == 0) {
            return;
        }
        Collections.sort(list, Comparator.comparingInt(String::length));

        final String minStr = list.get(0);
        String res = "";
        //System.out.println(minStr);
        A : for (int i = minStr.length(); i > 0; i--) {
            String t = minStr.substring(0, i);
            for (int ii = 1; ii < list.size(); ii++) {
                if (!list.get(ii).startsWith(t)) {
                    continue A;
                }
            }
            res = t;
            break;
        }
        System.out.println(res);

    }

}