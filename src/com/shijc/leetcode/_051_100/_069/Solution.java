package com.shijc.leetcode._051_100._069;

/**
 * 69.x 的平方根
 * sqrtx
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 */
public class Solution {
    /**
     * 牛顿迭代法
     */
    public int mySqrt(int x) {

        double err = 0.000001;
        double t = x;
        while(Math.abs(t-x/t)>err)
            t = (x/t+t)/2.0;
        return (int) t;

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.mySqrt(9);
        System.out.println(result);
    }

}
