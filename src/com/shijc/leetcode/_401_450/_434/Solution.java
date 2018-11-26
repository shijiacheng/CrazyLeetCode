package com.shijc.leetcode._401_450._434;

/**
 * 434.字符串中的单词数
 * number of segments in a string
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 */
public class Solution {
    public int countSegments(String s) {

        int count = 0;
        int flag  = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                count += flag;
                flag = 0;
            }else {
                flag = 1;
            }
        }

        count += flag;
        return count;
    }
}
