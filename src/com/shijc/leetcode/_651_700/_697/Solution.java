package com.shijc.leetcode._651_700._697;

import java.util.HashMap;
import java.util.Map;

/**
 * 697.数组的度
 * degree of an array
 * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 *
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 *
 * 示例 1:
 *
 * 输入: [1, 2, 2, 3, 1]
 * 输出: 2
 * 解释:
 * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
 * 连续子数组里面拥有相同度的有如下所示:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * 最短连续子数组[2, 2]的长度为2，所以返回2.
 * 示例 2:
 *
 * 输入: [1,2,2,3,1,4,2]
 * 输出: 6
 * 注意:
 *
 * nums.length 在1到50,000区间范围内。
 * nums[i] 是一个在0到49,999范围内的整数。
 */
public class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer,int[]> map = new HashMap<>();
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int[] temp = map.get(nums[i]);
                temp[1] = i;
                temp[2] = temp[2]+1;

            }else {
                int[] temp = new int[3];
                temp[0] = i;
                temp[1] = i;
                temp[2] = 1;
                map.put(nums[i],temp);
            }
            
            maxCount = Math.max(maxCount,map.get(nums[i])[2]);
        }

        int result = Integer.MAX_VALUE;

        for (int i:map.keySet()) {
            if (maxCount == map.get(i)[2]){
                result = Math.min(result,map.get(i)[1]-map.get(i)[0]+1);
            }
        }

        return result;
    }
}
