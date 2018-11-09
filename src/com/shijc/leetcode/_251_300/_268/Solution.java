package com.shijc.leetcode._251_300._268;

/**
 * 268.缺失数字
 * missing number
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 *
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */
public class Solution {
    /**
     * 思路：求出正常0..n的数组和给出数组的每一位的差的和，最后用长度-这个值就是所求
     */
    public int missingNumber(int[] nums) {

        int length = nums.length;
        int diff = 0;
        for (int i = 0; i < length; i++) {
            diff += (nums[i] - i);
        }

        return length - diff;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = new int[]{9,6,4,2,3,5,7,0,1};
        int result = solution.missingNumber(array);
        System.out.println(result);
    }
}
