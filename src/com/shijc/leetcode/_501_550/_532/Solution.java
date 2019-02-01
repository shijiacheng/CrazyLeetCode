package com.shijc.leetcode._501_550._532;

import java.util.Arrays;

/**
 * 532. 数组中的K-diff数对
 * k diff pairs in an array
 * 给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.
 *
 * 示例 1:
 *
 * 输入: [3, 1, 4, 1, 5], k = 2
 * 输出: 2
 * 解释: 数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
 * 尽管数组中有两个1，但我们只应返回不同的数对的数量。
 * 示例 2:
 *
 * 输入:[1, 2, 3, 4, 5], k = 1
 * 输出: 4
 * 解释: 数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5)。
 * 示例 3:
 *
 * 输入: [1, 3, 1, 5, 4], k = 0
 * 输出: 1
 * 解释: 数组中只有一个 0-diff 数对，(1, 1)。
 */
public class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0 || nums.length <= 1) {
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int result = 0;
        while (right < nums.length) {
            int first = nums[left];
            int second = nums[right];
            if (second - first < k) {
                right++;
            } else if (second - first > k) {
                left++;
            } else {
                result++;
                while (left < nums.length && nums[left] == first) {
                    left++;
                }

                while (right < nums.length && nums[right] == second) {
                    right++;
                }
            }

            if (left == right) {
                right++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        Solution solution = new Solution();
        int result = solution.findPairs(nums, k);
        System.out.println(result);
    }
}
