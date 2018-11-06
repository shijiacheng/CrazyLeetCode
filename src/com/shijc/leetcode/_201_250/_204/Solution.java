package com.shijc.leetcode._201_250._204;

/**
 * 204.计数质数
 * count primes
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class Solution {
    public int countPrimes(int n) {
        if (n<3){
            return 0;
        }

        boolean[] flag = new boolean[n];
        flag[0] = true;
        flag[1] = true;
        int num = n-2;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!flag[i]){
                for (int j = i*2; j < n; j+=i) {

                    if (!flag[j]){
                        flag[j] = true;
                        num--;
                    }
                }
            }
        }
        return num;

    }
}
