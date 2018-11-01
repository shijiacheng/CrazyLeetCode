package com.shijc.leetcode._001_050._042;

/**
 * 42.Trapping Rain Water
 * 接雨水
 */
public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0){
            return 0;
        }
        int max = 0;
        int v = 0;
        int[] container = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            container[i] = max;
            max = Math.max(max, height[i]);
        }
        max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            container[i] = Math.min(max, container[i]);
            max = Math.max(max, height[i]);
            v += container[i] - height[i] > 0 ? container[i] - height[i] : 0;
        }

        return v;

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}

