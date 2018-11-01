package com.shijc.leetcode._001_050._012;

/**
 * 12. Integer To Roman
 * 整数转罗马数字
 */
public class Solution {
    public String intToRoman(int num) {
        /**
         * Symbol       Value
         I             1
         V             5
         X             10
         L             50
         C             100
         D             500
         M             1000

         I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
         X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
         C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
         */

        StringBuilder sb = new StringBuilder();

        String[] signs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values =   {1000,900,500, 400,100, 90,  50, 40,  10, 9,   5,  4,   1};
        for (int i = 0; num!=0; i++) {
            while (num>=values[i]){
                num -= values[i];
                sb.append(signs[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String result = solution.intToRoman(1994);
        System.out.println(result);
    }
}
