package com.shijc.leetcode._301_350._342;

/**
 * 342.4的幂
 * power of four
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 16
 * 输出: true
 * 示例 2:
 *
 * 输入: 5
 * 输出: false
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num < 0)
            return false;
        int tmp = num-1;
        return (num & tmp) == 0 && tmp % 3 == 0;
    }
}
