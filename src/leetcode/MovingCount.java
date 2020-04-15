/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package leetcode;

import org.junit.Test;

/**
 *
 * @author xiekai.xk
 * @version $Id: MovingCount.java, v 0.1 2020-04-08 7:42 下午 xiekai.xk Exp $$
 */
public class MovingCount {

    @Test
    public void test() {
        final int i = new Solution().movingCount(2, 3, 1);
        System.out.println(i);
    }

    class Solution {
        int[] dx={0,0,-1,1};
        int[] dy={-1,1,0,0};
        public int movingCount(int m, int n, int k) {
            boolean[][] visited = new boolean[m][n];
            return dfs(0,0,m,n,k,visited);
        }
        int dfs(int x, int y, int m, int n, int k,boolean[][] visited) {
            if(x<0||x>=m||y<0||y>=n||visited[x][y]||!canAttach(x,y,k)) {
                return 0;
            }
            visited[x][y] = true;
            int res=0;
            for(int i=0;i<4;i++) {
                res+=dfs(x+dx[i],y+dy[i], m,n,k,visited);
            }
            return res+1;
        }
        boolean canAttach(int x, int y, int k) {
            int res=0;
            while(x>0) {
                res+=x%10;
                x/=10;
            }
            while(y>0) {
                res+=y%10;
                y/=10;
            }
            return res<=k;
        }
    }
}