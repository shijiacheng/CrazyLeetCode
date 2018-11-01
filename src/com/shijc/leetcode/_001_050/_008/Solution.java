package com.shijc.leetcode._001_050._008;

public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        } else if (str.length() == 1 && (str.charAt(0) == '-' || str.charAt(0) == '+')) {
            return 0;
        } else {
            int flag = 0;//1是整数，2是负数
            boolean error = false;
            char[] chars = str.toCharArray();
            int i = 0;
            if (chars[0] == '-') {
                i++;
                flag = 2;
            } else if (chars[0] == '+') {
                i++;
                flag = 1;
            }

            long result = 0;
            for (int j = i; j < chars.length; j++) {


                if (chars[j] >= '0' && chars[j] <= '9') {
                    result = result * 10 + (chars[j] - '0');
                } else {
                    error = true;
                    break;
                }
            }

            if (!error) {
                if (flag == 2) {
                    result = result * (-1);
                }
                if (result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                return (int) result;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.myAtoi("1234567"));
    }
}
