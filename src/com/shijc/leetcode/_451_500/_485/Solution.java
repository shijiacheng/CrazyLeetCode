package com.shijc.leetcode._451_500._485;

/**
 * 485.最大连续1的个数
 * max consecutive ones
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 *
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 *
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int temp = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                sum += nums[i];
            }else {
                if (sum>temp){
                    temp = sum;
                }
                sum = 0;
            }
        }

        if (sum > temp){
            temp =sum;
        }

        return temp;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = {1,1,0,1,1,1};
        int result = solution.findMaxConsecutiveOnes(array);
        System.out.println(result);
    }
}
