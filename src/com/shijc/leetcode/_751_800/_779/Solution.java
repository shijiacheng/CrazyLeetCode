package com.shijc.leetcode._751_800._779;

/**
 * 779. 第K个语法符号
 * k th symbol in grammar
 * 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 *
 * 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
 *
 *
 * 例子:
 *
 * 输入: N = 1, K = 1
 * 输出: 0
 *
 * 输入: N = 2, K = 1
 * 输出: 0
 *
 * 输入: N = 2, K = 2
 * 输出: 1
 *
 * 输入: N = 4, K = 5
 * 输出: 1
 *
 * 解释:
 * 第一行: 0
 * 第二行: 01
 * 第三行: 0110
 * 第四行: 01101001
 *
 * 注意：
 *
 * N 的范围 [1, 30].
 * K 的范围 [1, 2^(N-1)].
 */
public class Solution {
    /**
     * 动态规划的减而治之问题，将规模为N的问题转化为解决规模为N-1的问题。
     *
     * 观察到，当N大于1时，此时这一行的奇数位的数和替换它的数是相同的，而偶数位的数和替换它的数相反（0和1相反）。
     *
     * 举例：第4行第7位（奇数位），数字是0，和替换它的第3行第4位，是相同的（都是0）；
     *
     * 第3行第4位（偶数位），数字是0，和替换它的第2行第2位（数字1），是相反的。
     */
    public int kthGrammar(int N, int K) {

        if (N == 1){
            return 0;
        }
        int result = -1;
        if (K % 2 == 1){

            result = kthGrammar(N-1,(K+1)/2);
        }else {
            result = 1 - kthGrammar(N-1,(K+1)/2);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.kthGrammar(4,5);
        System.out.println(result);
    }
}
