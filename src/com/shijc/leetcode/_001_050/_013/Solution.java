package com.shijc.leetcode._001_050._013;

/**
 * 13. Roman To Integer
 * 罗马数字转整数
 */
public class Solution {
    public int romanToInt(String s) {
        /**
         * I             1
         V             5
         X             10
         L             50
         C             100
         D             500
         M             1000
         */
        int[] nums = new int[s.length()];

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }

        int result = 0;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i]<nums[i+1]){
                result -= nums[i];
            }else {
                result += nums[i];
            }
        }

        result += nums[nums.length-1];
        return result;

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.romanToInt("MCMXCIV");
        System.out.println(result);
    }
}
