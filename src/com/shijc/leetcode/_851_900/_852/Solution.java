package com.shijc.leetcode._851_900._852;

/**
 * 852. 山脉数组的峰顶索引
 * peak index in a mountain array
 * 我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 *
 *
 *
 * 示例 1：
 *
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 *
 * 输入：[0,2,1,0]
 * 输出：1
 *
 *
 * 提示：
 *
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A 是如上定义的山脉
 */
public class Solution {
    /**
     * 思路：二分查找，找到比左边大，比右边小的那个数
     */
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int middle = 0;

        while(left<right){
            middle = (left+right)/2;
            if(A[middle-1]<A[middle] && A[middle+1]>A[middle]){
                left = middle;
            }else if(A[middle-1]>A[middle] && A[middle+1]<A[middle]){
                right = middle;
            }else{
                break;
            }
        }
        return middle;

    }
}
