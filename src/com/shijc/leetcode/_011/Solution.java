package com.shijc.leetcode._011;

/**
 * 11.Container with most water
 * 盛最多水的容器
 *
 */
public class Solution {
    public int maxArea(int[] height) {

        if (height.length<2){
            return 0;
        }

        int left = 0;
        int right = height.length-1;
        int maxV = 0;

        while (left<right){
            int v = Math.min(height[left],height[right])*(right-left);
            maxV = Math.max(v,maxV);
            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }

        return maxV;
    }


    public static void main(String[] args){
        Solution solution = new Solution();
        int v = solution.maxArea(new int[]{1,1});
        System.out.println(v);
    }
}
