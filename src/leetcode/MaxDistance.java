/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 你现在手里有一份大小为 N x N 的『地图』（网格） grid，上面的每个『区域』（单元格）都用 0 和 1 标记好了。其中 0 代表海洋，1 代表陆地，你知道距离陆地区域最远的海洋区域是是哪一个吗？请返回该海洋区域到离它最近的陆地区域的距离。
 *
 * 我们这里说的距离是『曼哈顿距离』（ Manhattan Distance）：(x0, y0) 和 (x1, y1) 这两个区域之间的距离是 |x0 - x1| + |y0 - y1| 。
 *
 * 如果我们的地图上只有陆地或者海洋，请返回 -1。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/as-far-from-land-as-possible
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author xiekai.xk
 * @version $Id: MaxDistance.java, v 0.1 2020-03-29 8:36 下午 xiekai.xk Exp $$
 */
public class MaxDistance {

    @Test
    public void test() {

        final int i = new Solution().maxDistance(new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}});
        System.out.println(i);

    }

    class Solution {
        public int maxDistance(int[][] grid) {
            int[] dx = {0, 0, -1, 1}, dy = {-1, 1, 0, 0};

            Queue<int[]> queue = new ArrayDeque<>();

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        queue.offer(new int[] {i, j});
                    }
                }
            }

            int[]   poll = null;
            boolean has  = false;
            while (!queue.isEmpty()) {
                poll = queue.poll();
                int x = poll[0], y = poll[1];
                for (int i = 0; i < 4; i++) {
                    int newX = x + dx[i];
                    int newY = y + dy[i];
                    //找出为海洋的坐标
                    if (newX < 0 || newX > grid.length - 1 || newY < 0 || newY > grid[0].length - 1 || grid[newX][newY] != 0) {
                        continue;
                    }
                    has = true;
                    grid[newX][newY] = grid[x][y] + 1;
                    queue.add(new int[] {newX, newY});
                }
            }
            if (!has || poll == null) {
                return -1;
            }
            return grid[poll[0]][poll[1]] - 1;
        }
    }

}