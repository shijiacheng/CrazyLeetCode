package com.shijc.leetcode._161_200._191;

/**
 * 191.位1的个数
 * number of 1 bits
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 *
 * 示例 :
 *
 * 输入: 11
 * 输出: 3
 * 解释: 整数 11 的二进制表示为 00000000000000000000000000001011
 *
 *
 * 示例 2:
 *
 * 输入: 128
 * 输出: 1
 * 解释: 整数 128 的二进制表示为 00000000000000000000000010000000
 */
public class Solution {
    // you need to treat n as an unsigned value

    /**
     * 思路，将原来的数减1然后做位与运算，得到的结果相当于把原来整数的二进制中最右边的1变为0；
     */
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.hammingWeight(11);
        System.out.println(result);
    }
}
