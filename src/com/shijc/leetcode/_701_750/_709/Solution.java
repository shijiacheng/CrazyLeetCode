package com.shijc.leetcode._701_750._709;

/**
 * 709.转换成小写字母
 * to lower case
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 */
public class Solution {
    public String toLowerCase(String str) {

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                sb.append(str.charAt(i));
            }else if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                char temp = (char) (str.charAt(i)+32);
                sb.append(temp);
            }else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){

        Solution solution = new Solution();
        String result = solution.toLowerCase("Hello");
        System.out.println(result);

    }
}
