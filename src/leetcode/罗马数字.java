/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xiekai.xk
 * @version $Id: 罗马数字.java, v 0.1 2019-09-14 1:47 PM xiekai.xk Exp $$
 */
public class 罗马数字 {

    @Test
    public void testSolution() {
        String s = "MCMXCIV";

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            final char l = s.charAt(i);
            final Integer integer = map.get(l);
            if (i < s.length() - 1 && integer < map.get(s.charAt(i + 1))) {
                res += (-1) * integer;
            } else {
                res += integer;
            }
        }
        //final Integer cL2 = map.get(String.valueOf(s.charAt(s.length() - 2)));
        //final Integer cL1 = map.get(String.valueOf(s.charAt(s.length() - 1)));
        //if (cL2 > cL1) {
        //    res += cL2;
        //    res += (-1) * cL1;
        //} else if (cL2.equals(cL1)){
        //    res += cL2;
        //    res += cL1;
        //} else {
        //    res += (cL1 - cL2);
        //}
        System.out.println(res);
    }
}