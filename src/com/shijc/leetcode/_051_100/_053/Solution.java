package com.shijc.leetcode._051_100._053;

/**
 * 53. 最大子序和
 * Maximum Subarray
 * 给定一个整数数组 nums，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * @author shijiacheng
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = nums[0];//默认选择第一个数
        int a = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (a > 0) {
                a += nums[i];
            } else {
                a = nums[i];
            }

            if (sum < a) {
                sum = a;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = s.maxSubArray(nums);
        System.out.println(sum);
    }
}
