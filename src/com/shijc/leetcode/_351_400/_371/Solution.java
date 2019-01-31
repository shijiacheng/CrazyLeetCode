package com.shijc.leetcode._351_400._371;

/**
 * 371. 两整数之和
 * sum of two integers
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 *
 * 输入: a = -2, b = 3
 * 输出: 1
 */
public class Solution {
    public int getSum(int a, int b) {

        while (a!=0){
            int temp = (a &b)<<1;
            b = a ^b ;
            a = temp;
        }

        return b;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.getSum(20,300);
        System.out.println(result);
    }
}
