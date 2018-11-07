package com.shijc.leetcode._201_250._219;

import java.util.HashMap;
import java.util.Map;

/**
 * 219.存在重复元素 II
 * contains duplicate ii
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
 * 使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 */
public class Solution {
    /**
     * 思路，哈希表，记录数组中每个字符的位置
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums == null || nums.length == 0){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                if (i - index<=k){
                    return true;
                }else {
                    map.put(nums[i],i);
                }
            }else {
                map.put(nums[i],i);
            }
        }

        return false;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = new int[]{1,0,2,1};
        boolean result = solution.containsNearbyDuplicate(array,1);
        System.out.println(result);
    }
}
