package com.shijc.leetcode._551_600._557;

/**
 * 557.反转字符串中的单词 III
 * reverse words in a string iii
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class Solution {
    public String reverseWords(String s) {

        String[] strings = s.split(" ");
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            if (i<strings.length-1){
                result+=reverseOnce(strings[i])+" ";
            }else {
                result+=reverseOnce(strings[i]);
            }

        }

        return result;

    }


    private String reverseOnce(String s) {
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
        String resule = s.reverseWords("Let's take LeetCode contest");
        System.out.println(resule);
    }
}
