package com.shijc.leetcode._651_700._680;

/**
 * 680.验证回文字符串 Ⅱ
 * valid palindrome ii
 *
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 示例 1:
 *
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 *
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 *
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 */
public class Solution {
    public boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length()-1;
        int flag = 0;

        return validPalindrome(s,start,end,flag);

    }

    private boolean validPalindrome(String s,int start,int end,int flag) {

        while (start<end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else {
                if (flag == 1){
                    return false;
                }
                flag = 1;

                return validPalindrome(s,start+1,end,flag) ||
                        validPalindrome(s,start,end-1,flag);

            }
        }

        return true;

    }


    public static void main(String[] args){
        Solution s = new Solution();
        boolean result = s.validPalindrome("abca");
        System.out.println(result);
    }
}
