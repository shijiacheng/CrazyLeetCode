package com.shijc.leetcode._301_350._350;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 350.两个数组的交集 II
 * intersection of two arrays II
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList result = new ArrayList();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ){
            if (nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            res[i] = (int) result.get(i);
        }
        return res;
    }
}
