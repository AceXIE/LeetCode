/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/rotting-oranges/submissions/
 * @author xiekai.xk
 * @version $Id: OrangesRotting.java, v 0.1 2020-03-04 2:32 下午 xiekai.xk Exp $$
 */
public class OrangesRotting {

    @Test
    public void test() {
        int[][]   grid = new int[][] {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        final int i    = new Solution().orangesRotting(grid);
        System.out.println(i);
    }

    class Solution {
        public int orangesRotting(int[][] grid) {
            int[]        dx    = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
            Queue<int[]> queue = new ArrayDeque<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 2) {
                        queue.offer(new int[] {i, j});
                    }
                }
            }
            int step = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    final int[] poll = queue.poll();
                    for (int j = 0; j < dx.length; j++) {
                        int x = poll[0] + dx[j], y = poll[1] + dy[j];
                        if (x >= 0 && x < grid[0].length && y >= 0 && y < grid.length && grid[x][y] == 1) {
                            grid[x][y] = 2;
                            queue.offer(new int[] {x, y});
                        }
                    }
                }
                if (!queue.isEmpty()) {
                    step++;
                }
            }

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1) { return -1; }
                }
            }
            return step;
        }
    }
}