package com.shijc.leetcode._351_400._371;

/**
 * 371. 两整数之和
 * sum of two integers
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 *
 * 输入: a = -2, b = 3
 * 输出: 1
 */
public class Solution {
    /**
     * 对于二进制的加法运算，若不考虑进位，则1+1=0，1+0=1，0+1=1，0+0=0，
     * 通过对比异或，不难发现，此方法与异或运算类似。因而排出进位，加法可用异或来实现。
     * 然后考虑进位，0+0进位为0，1+0进位为0，0+1进位为0，1+1进位为1，
     * 该操作与位运算的&操作相似。
     *
     * 那么加法运算可以这样实现：
     * （1）先不考虑进位，按位计算各位累加（用异或实现），得到值a；
     * （2）然后再考虑进位，并将进位的值左移，得值b，若b为0，则a就是加法运算的结果，
     * 若b不为0，则a+b即得结果，此时可递归调用位运算函数。
     * @param a
     * @param b
     * @return
     */
    public int getSum(int a, int b) {

        while (a!=0){
            int temp = (a &b)<<1;
            b = a ^b ;
            a = temp;
        }

        return b;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int result = solution.getSum(20,300);
        System.out.println(result);
    }
}
