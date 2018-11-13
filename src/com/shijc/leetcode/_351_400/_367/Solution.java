package com.shijc.leetcode._351_400._367;

/**
 * 367.有效的完全平方数
 * valid perfect square
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *
 * 说明：不要使用任何内置的库函数，如  sqrt。
 *
 * 示例 1：
 *
 * 输入：16
 * 输出：True
 * 示例 2：
 *
 * 输入：14
 * 输出：False
 */
public class Solution {
    /**
     * 使用牛顿迭代法
     */
    public boolean isPerfectSquare(int num) {
        if (num<0){
            return false;
        }
        double err = 0.000001;
        double t = num;
        while(Math.abs(t-num/t)>err)
            t = (num/t+t)/2.0;

        int temp = (int) t;
        if (temp*temp == num){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        boolean result = solution.isPerfectSquare(15);
        System.out.println(result);
    }
}
