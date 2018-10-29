package com.shijc.leetcode._151_200._190;

/**
 * 190.颠倒二进制位
 * 颠倒给定的 32 位无符号整数的二进制位。
 *
 * 示例:
 * 输入: 43261596
 * 输出: 964176192
 * 解释: 43261596 的二进制表示形式为 00000010100101000001111010011100 ，
 * 返回 964176192，其二进制表示形式为 00111001011110000010100101000000 。
 */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int k = 0;
        int num = 1;
        while (num<=32){
            if (k==0){
                k = n&1;
            }else {
                k = (k<<1)|(n&1);
            }
            n>>=1;
            num++;

        }

        return k;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.reverseBits(43261596);
        System.out.println(result);
    }
}
