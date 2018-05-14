package com.shijc.leetcode._014;

import java.util.Arrays;

/**
 * 14.Longest Common Prefix
 * 最长公共前缀
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0){
            return "";
        }

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < first.length; i++) {

            if (i<last.length && first[i] == last[i]){
                sb.append(first[i]);
            }else {
                return sb.toString();
            }
        }
        return sb.toString();

    }


    public static void main(String[] args){
        Solution solution = new Solution();
        String[] str = new String[]{"dog","racecar","car"};
        String result = solution.longestCommonPrefix(str);
        System.out.println(result);
    }
}
