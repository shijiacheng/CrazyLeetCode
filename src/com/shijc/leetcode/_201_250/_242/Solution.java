package com.shijc.leetcode._201_250._242;

/**
 * 242.有效的字母异位词
 * valid anagram
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 */
public class Solution {
    /**
     * 思路：字符串中只有小写字母，那么最多26个，写一个数组，转换成每一位的个数
     */
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()){
            return false;
        }

        int[] sChars = new int[26];
        int[] tChars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sChars[s.charAt(i)-97]+=1;
            tChars[t.charAt(i)-97]+=1;
        }

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i]!=tChars[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "anagram", t = "nagaram";
        boolean result = solution.isAnagram(s,t);
        System.out.println(result);
    }
}
