package com.shijc.leetcode._001_050._001;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1.Two Sum
 * 两数之和
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target - nums[i],i);
        }
        return null;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = new int[]{2,7,11,15};
        int[] result = solution.twoSum(nums,9);
        System.out.println(Arrays.toString(result));
    }

}
