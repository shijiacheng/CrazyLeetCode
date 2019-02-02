package com.shijc.leetcode._651_700._695;

/**
 * 695. 岛屿的最大面积
 * max area of island
 * 给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。
 *
 * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)
 *
 * 示例 1:
 *
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,1,1,0,1,0,0,0,0,0,0,0,0],
 *  [0,1,0,0,1,1,0,0,1,0,1,0,0],
 *  [0,1,0,0,1,1,0,0,1,1,1,0,0],
 *  [0,0,0,0,0,0,0,0,0,0,1,0,0],
 *  [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *  [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * 对于上面这个给定矩阵应返回 6。注意答案不应该是11，因为岛屿只能包含水平或垂直的四个方向的‘1’。
 *
 * 示例 2:
 *
 * [[0,0,0,0,0,0,0,0]]
 * 对于上面这个给定的矩阵, 返回 0。
 *
 * 注意: 给定的矩阵grid 的长度和宽度都不超过 50。
 */
public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        /**
         * 深度优先搜索
         */
        if (grid == null || grid.length == 0){
            return 0;
        }

        int result = 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] mark = new boolean[row][col];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                if (mark[i][j]){
                    continue;
                }
                int temp = dfs(grid,i,j,mark);
                result = Math.max(result,temp);
            }
        }

        return result;
    }


    private int dfs(int[][] grid,int x,int y,boolean[][] mark){
        if (x>= grid.length || y>= grid[0].length||x<0||y<0){
            return 0;
        }
        if (mark[x][y]){
            return 0;
        }
        if (grid[x][y] == 0){
            return 0;
        }
        // 对于点[x,y]搜索上下左右4个点是否是岛屿
        // 即[x-1,y],[x+1,y],[x,y-1],[x,y+1]
        // 对于已经搜索过的点要进行标记

        mark[x][y] = true;

        return 1+dfs(grid,x+1,y,mark)+dfs(grid,x-1,y,mark)+dfs(grid,x,y+1,mark)
                + dfs(grid,x,y-1,mark);

    }
}
