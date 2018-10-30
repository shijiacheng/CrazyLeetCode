package com.shijc.leetcode._051_100._058;

/**
 * 58.最后一个单词的长度
 * length of last word
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 */
public class Solution {
    public int lengthOfLastWord(String s) {

        String[] strs = s.split(" ");
        if (strs!=null && strs.length>0){
            return strs[strs.length-1].length();
        }
        return 0;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.lengthOfLastWord("Hello World");
        System.out.println(result);
    }
}
