package com.shijc.leetcode._501_550._521;

/**
 * 521.最长特殊序列 Ⅰ
 * longest uncommon subsequence i
 * 给定两个字符串，你需要从这两个字符串中找出最长的特殊序列。最长特殊序列定义如下：该序列为某字符串独有的最长子序列（即不能是其他字符串的子序列）。
 *
 * 子序列可以通过删去字符串中的某些字符实现，但不能改变剩余字符的相对顺序。空序列为所有字符串的子序列，任何字符串为其自身的子序列。
 *
 * 输入为两个字符串，输出最长特殊序列的长度。如果不存在，则返回 -1。
 *
 * 示例 :
 *
 * 输入: "aba", "cdc"
 * 输出: 3
 * 解析: 最长特殊序列可为 "aba" (或 "cdc")
 * 说明:
 *
 * 两个字符串长度均小于100。
 * 字符串中的字符仅含有 'a'~'z'。
 */
public class Solution {
    /**
     * 分析：
     * 　　1. 如果两个字符串长度相等，但内容不相同，则返回其中一个的长度；
     * 　　2. 如果两个字符串长度相等且内容一样，那么没有子序列；
     * 　　3. 如果两个字符串长度不等，那么返回其中较长的一个。
     */
    public int findLUSlength(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        if (lengthA != lengthB){
            return Math.max(lengthA,lengthB);
        }else if (!a.equals(b)){
            return lengthA;
        }else {
            return -1;
        }
    }
}
