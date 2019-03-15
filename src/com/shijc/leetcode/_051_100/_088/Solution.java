package com.shijc.leetcode._051_100._088;

/**
 * 88. 合并两个有序数组
 * Merge Sorted Array
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 *
 * @author shijiacheng
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;//第一个数组的索引
        int b = n - 1;//第二个数组的索引
        int c = m + n - 1;

//        while (c >= 0) {
//            if (b < 0 || (a >= 0 && nums1[a] > nums2[b])) {
//                nums1[c--] = nums1[a--];
//            } else {
//                nums1[c--] = nums2[b--];
//            }
//        }

        while (c>=0){
            if (b<0||a>=0 && nums1[a]>nums2[b]){
                nums1[c--] = nums1[a--];
            }else {
                nums1[c--] = nums2[b--];
            }
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        s.merge(nums1, m, nums2, n);
        System.out.println(nums1[5]);
    }

}
