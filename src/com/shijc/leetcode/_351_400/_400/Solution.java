package com.shijc.leetcode._351_400._400;

/**
 * 400.第N个数字
 * nth digit
 * 在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
 *
 * 注意:
 * n 是正数且在32为整形范围内 ( n < 231)。
 *
 * 示例 1:
 *
 * 输入:
 * 3
 *
 * 输出:
 * 3
 * 示例 2:
 *
 * 输入:
 * 11
 *
 * 输出:
 * 0
 *
 * 说明:
 * 第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 */
public class Solution {
    public int findNthDigit(int n) {

        long bitNum = 1;//位数，从1位开始
        long bitNumCount = 9;//每一位拥有的数字的数量
        long bitIndex = 1;//每一位开始的数


        while (n>bitNum*bitNumCount){
            n -= bitNum*bitNumCount;
            bitNum++;
            bitIndex += bitNumCount;
            bitNumCount *=10;
        }

        long findNum = bitIndex+(n-1)/bitNum;//找到的数字，真实的数字

        long bitPosition = (n-1)%bitNum ;//n在找到数字的第几位

        long result = 0;

        while (bitNum-bitPosition>0){
            result = findNum %10;
            findNum /=10;
            bitPosition++;
        }

        return (int) result;

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.findNthDigit(140);

        System.out.println(result);
    }
}
