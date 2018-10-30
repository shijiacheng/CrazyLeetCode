package com.shijc.leetcode._051_100._067;

/**
 * 67.二进制求和
 * add binary
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class Solution {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int al = a.length()-1;
        int bl = b.length()-1;
        int carry = 0;

        while( al >=0  || bl >=0 )
        {
            int sum = carry;
            if(al >= 0)
            {
                sum += (a.charAt(al) - '0');
                al--;
            }
            if(bl >= 0)
            {
                sum += (b.charAt(bl) - '0');
                bl--;
            }
            result.append(sum%2);   //相加结果
            carry = sum /2;         //进位，如果是1那么carry=0，如果是2则要进位给下面一位+1
        }

        if(carry !=0 )              //都相加完了，还要进位的情况
            result.append(1);

        return result.reverse().toString();  //先反转，再输出
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String result = solution.addBinary("1010","1011");
        System.out.println(result);
    }

}
