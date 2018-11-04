package com.shijc.leetcode._101_150._125;

import java.util.ArrayList;
import java.util.List;

/**
 * 125.验证回文串
 * valid palindrome
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        char[] chars = s.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z'
                    || chars[i] >= 'a' && chars[i] <= 'z'
                    || chars[i]>='0' && chars[i]<='9') {
                list.add(chars[i]);
            }
        }

        int left = 0;
        int right = list.size()-1;
        while (left<right){
            if (list.get(left) != list.get(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        boolean result = solution.isPalindrome("op");
        System.out.println(result);
    }
}
