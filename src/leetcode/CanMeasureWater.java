/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
 *
 * 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
 *
 * 你允许：
 *
 * 装满任意一个水壶
 * 清空任意一个水壶
 * 从一个水壶向另外一个水壶倒水，直到装满或者倒空
 * 示例 1: (From the famous "Die Hard" example)
 *
 * 输入: x = 3, y = 5, z = 4
 * 输出: True
 * 示例 2:
 *
 * 输入: x = 2, y = 6, z = 5
 * 输出: False
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/water-and-jug-problem
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author xiekai.xk
 * @version $Id: CanMeasureWater.java, v 0.1 2020-03-21 9:15 下午 xiekai.xk Exp $$
 */
public class CanMeasureWater {

    @Test
    public void test() {
        final boolean b = new Solution().canMeasureWater(3, 5, 4);
        System.out.println(b);
    }

    class Solution {
        public boolean canMeasureWater(int x, int y, int z) {
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[] {0, 0});
            Set<Map.Entry<Integer, Integer>> set = new HashSet<>();

            while (!stack.isEmpty()) {
                final int[] pop      = stack.pop();
                final int   remain_x = pop[0];
                final int   remain_y = pop[1];
                if (remain_x == z || remain_y == z || remain_x + remain_y == z) {
                    return true;
                }
                if (set.contains(new AbstractMap.SimpleEntry<>(remain_x, remain_y))) {
                    continue;
                }
                set.add(new AbstractMap.SimpleEntry<>(remain_x, remain_y));
                //把x倒满
                stack.push(new int[] {x, remain_y});
                //把x倒满
                stack.push(new int[] {remain_x, y});
                // 把 X 壶倒空。
                stack.push(new int[] {0, remain_y});
                //把 Y 壶倒空。
                stack.push(new int[] {remain_x, 0});
                //把 X 壶的水灌进 Y 壶，直至灌满或倒空。
                stack.push(new int[] {remain_x - Math.min(remain_x, y - remain_y), remain_y + Math.min(remain_x, y - remain_y)});
                //把 Y 壶的水灌进 X 壶，直至灌满或倒空。
                stack.push(new int[] {remain_x + Math.min(remain_y, x - remain_x), remain_y - Math.min(remain_y, x - remain_x)});

            }
            return false;
        }
    }

    class Pair {
        int x;

        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) { return true; }

            if (o == null || getClass() != o.getClass()) { return false; }

            Pair pair = (Pair) o;

            return this.x == pair.x && this.y == pair.y;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }
}