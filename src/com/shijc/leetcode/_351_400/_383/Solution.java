package com.shijc.leetcode._351_400._383;

/**
 * 383.赎金信
 * ransom note
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 *
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 *
 * 注意：
 *
 * 你可以假设两个字符串均只含有小写字母。
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote == null || ransomNote.length() == 0){
            return true;
        }
        if (magazine == null || magazine.length() == 0){
            return false;
        }


        int[] array = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            array[magazine.charAt(i)-'a']+= 1;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (array[ransomNote.charAt(i)-'a'] <= 0){
                return false;
            }else {
                array[ransomNote.charAt(i)-'a']-= 1;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Solution s = new Solution();

        boolean result = s.canConstruct("fihjjjjei","hjibagacbhadfaefdjaeaebgi");
        System.out.println(result);
    }
}
