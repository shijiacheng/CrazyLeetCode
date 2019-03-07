package com.shijc.leetcode._451_500._463;

/**
 * 463. 岛屿的周长
 * island perimeter
 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
 *
 * 网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
 *
 * 岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
 *
 *
 *
 * 示例 :
 *
 * 输入:
 * [[0,1,0,0],
 *  [1,1,1,0],
 *  [0,1,0,0],
 *  [1,1,0,0]]
 *
 * 输出: 16
 *
 * 解释: 它的周长是下面图片中的 16 个黄色的边：
 */
public class Solution {
    /**
     * 是1的地方表示陆地，周长+4，判断他的上下左右四周，每遇到1个1，说明相连，周长-1
     */
    public int islandPerimeter(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int result = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1){
                    result = result+4;

                    if (j-1>=0 && grid[i][j-1] == 1){
                        result--;
                    }
                    if (j+1<col&&grid[i][j+1] == 1){
                        result--;
                    }
                    if (i-1>= 0 && grid[i-1][j] == 1){
                        result--;
                    }
                    if (i+1<row&&grid[i+1][j] == 1){
                        result--;
                    }


                }
            }
        }


        return result;
    }
}
