package com.shijc.leetcode._301_350._344;

/**
 * 344.翻转字符串
 * Reverse String
 * 编写一个函数，其作用是将输入的字符串反转过来。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "olleh"
 * 示例 2:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: "amanaP :lanac a ,nalp a ,nam A"
 */
public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return new String(chars);
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.reverseString("hello"));
    }
}
