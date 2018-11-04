package com.shijc.leetcode._151_200._167;

/**
 * 167. 两数之和 II - 输入有序数组
 * Two Sum II - Input array is sorted
 * 两数之和 II - 输入有序数组
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * <p>
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * <p>
 * 说明:
 * <p>
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 * <p>
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 * @author shijiacheng
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;//第一个指针
        int b = numbers.length - 1;//第二个指针
        int[] result = new int[2];
        while (a < b) {
            if (numbers[a] + numbers[b] == target) {
                result[0] = a + 1;
                result[1] = b + 1;
                break;
            } else if (numbers[a] + numbers[b] > target) {
                b--;
            } else {
                a++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = s.twoSum(numbers, target);
        System.out.println(result[0] + "-----" + result[1]);
    }
}
