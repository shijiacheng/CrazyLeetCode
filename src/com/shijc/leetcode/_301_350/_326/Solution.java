package com.shijc.leetcode._301_350._326;

/**
 * 326.3的幂
 * power of three
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 27
 * 输出: true
 * 示例 2:
 *
 * 输入: 0
 * 输出: false
 * 示例 3:
 *
 * 输入: 9
 * 输出: true
 * 示例 4:
 *
 * 输入: 45
 * 输出: false
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 */
public class Solution {
    /**
     * 题目要求不能使用循环或者递归，这里需要用到数学的一点小技巧。
     *
     * 首先如果n《=0，那么一定返货false
     *
     * 如果n是3的x次方，那么y=log3(n)一定是一个整数，而且3^y一定等于n
     *
     * 在java里没有底为3的log对数运算，所以这里需要用到换底公式
     */
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (Math.pow(3, Math.round(Math.log(n) / Math.log(3))) == n) {
            return true;
        }
        return false;
    }
}
