package com.shijc.leetcode._251_300._283;

/**
 * 	283.移动零
 * 	move zeroes
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class Solution {
    /**
     * 思路：双指针来做，前面的指针指向处理过的最后一个非零数字， 后面一个指针向后扫，
     * 遇到非零数字，和前面指针所指数字交换位置，前面指针后移1位。
     */
    public void moveZeroes(int[] nums) {

        int index = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }
}
