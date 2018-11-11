package com.shijc.leetcode._301_350._303;

/**
 * 303.区域和检索 - 数组不可变
 * range sum query immutable
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 *
 * 示例：
 *
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * 说明:
 *
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法。
 */
public class Solution {

    class NumArray {

        private int[] arraySums;

        public NumArray(int[] nums) {
            arraySums = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                if (i == 0){
                    arraySums[i] = nums[i];
                }else {
                    arraySums[i] = arraySums[i-1] + nums[i];
                }
            }
        }

        public int sumRange(int i, int j) {

            if (i == 0){
                return arraySums[j];
            }else {
                return arraySums[j] - arraySums[i-1];

            }
        }
    }
}
