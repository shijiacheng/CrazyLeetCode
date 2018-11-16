package com.shijc.leetcode._301_350._345;

/**
 * 345.反转字符串中的元音字母
 * reverse vowels of a string
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 */
public class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length()<=1){
            return s;
        }

        int start = 0;
        int end = s.length()-1;

        char[] chars = s.toCharArray();

        while (start<end){
            while (start<end){
                if (isVowel(chars[start])){
                    break;
                }else {
                    start++;
                }
            }

            while (start<end){
                if (isVowel(chars[end])){
                    break;
                }else {
                    end--;
                }
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return new String(chars);
    }

    private boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' ||c == 'o' ||c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||c == 'O' ||c == 'U' ){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String result = solution.reverseVowels("hello");
        System.out.println(result);
    }
}
