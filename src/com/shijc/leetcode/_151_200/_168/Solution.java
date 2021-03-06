package com.shijc.leetcode._151_200._168;

/**
 * 168.Excel表列名称
 * excel sheet column title
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 */
public class Solution {
    public String convertToTitle(int n) {
        String ret = "";
        while(n>0)
        {
            ret = (char)((n-1)%26+'A') + ret;
            n = (n-1)/26;
        }
        return ret;
    }

    public static void main(String[] args){

        Solution solution = new Solution();
        String result = solution.convertToTitle(701);
        System.out.println(result);
    }
}
