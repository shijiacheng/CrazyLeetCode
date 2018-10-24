package com.shijc.leetcode._161_200._198;

/**
 * 198.打家劫舍
 * house robber
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 *
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */
public class Solution {
    /**
     * 动态规划DP。本质相当于在一列数组中取出一个或多个不相邻数，使其和最大。
     *
     * State: dp[i]，表示到第i个房子时能够抢到的最大金额。
     *
     * Function: dp[i] = max(num[i] + dp[i - 2], dp[i - 1])
     *
     * Initialize: dp[0] = num[0], dp[1] = max(num[0], num[1])
     *
     * Return: dp[n]
     */
    public int rob(int[] nums) {

        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }

        // 上次最高金额
        int a = nums[0];
        // 本次最高金额
        int b = Math.max(nums[0],nums[1]);

        for (int i = 2; i < nums.length; i++) {

            int temp = b;
            b = Math.max(a+nums[i],b);
            a = temp;
        }

        return b;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        int[] array = new int[]{2,7,9,3,1};
        int result = s.rob(array);
        System.out.println(result);
    }
}
