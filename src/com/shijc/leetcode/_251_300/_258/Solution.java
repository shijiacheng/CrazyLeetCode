package com.shijc.leetcode._251_300._258;

/**
 * 258.各位相加
 * add digits
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 */
public class Solution {
    public int addDigits(int num) {


        int result = 0;
        while (true){

            if (num<10){
                return num;
            }

            while (num>0){
                result += num%10;
                num /= 10;
            }

            num = result;
            result = 0;
        }

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.addDigits(38);
        System.out.println(result);
    }
}
