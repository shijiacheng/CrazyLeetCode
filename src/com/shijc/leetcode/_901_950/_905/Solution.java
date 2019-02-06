package com.shijc.leetcode._901_950._905;

/**
 * 	905.按奇偶排序数组
 * 	sort array by parity
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 *
 * 提示：
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {

        int start = 0;
        int end = A.length-1;

        while (start<end){
            if (A[start]%2 == 0){
                start++;
            }else {
                if (A[end] %2==0){
                    int temp = A[end];
                    A[end] = A[start];
                    A[start] = temp;
                    start++;
                    end--;
                }else {
                    end--;
                }
            }
        }

        return A;

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] array = new int[]{3,1,2,4};
        int[] result = solution.sortArrayByParity(array);
        System.out.println(result);
    }
}
