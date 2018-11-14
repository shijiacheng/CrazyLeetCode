package com.shijc.leetcode._351_400._389;

/**
 * 389.找不同
 * find the difference
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 */
public class Solution {
    public char findTheDifference(String s, String t) {

        int[] array = new int[26];

        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)-'a'] +=1;
        }

        int i = 0;

        for(i = 0;i<t.length();i++){
            if (array[t.charAt(i)-'a']<=0){
                break;
            }else {
                array[t.charAt(i)-'a'] -=1;
            }
        }

        return t.charAt(i);
    }

    public static void main(String[] args){
        Solution s = new Solution();
        char result = s.findTheDifference("abcd","abcde");
        System.out.println(result);
    }
}
