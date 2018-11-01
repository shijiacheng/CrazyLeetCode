package com.shijc.leetcode._001_050._027;

/**
 * 27. Remove Element
 * 移除元素
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 示例 1:
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 注意这五个元素可为任意顺序。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * @author shijiacheng
 */
public class Solution {
    /**
     * 使用两个游标i，j，遍历数组，如果碰到了value，使用j记录位置，同时递增i，
     * 直到下一个非value出现，将此时i对应的值复制到j的位置上，增加j，重复上述
     * 过程直到遍历结束。这时候j就是新的数组。比如数组为1，2，2，3，2，4，删除
     * 2，首先初始化i和j为0，指向第一个位置，因为第一个元素为1，
     * 所以A[0] = A[0]，i和j都加1，而第二个元素为2，我们递增i，直到碰到3，
     * 此时v[1] = v[3]，也就是3，递增i和j，这时候下一个元素又是2，递增i，直
     * 到碰到4，此时v[2] = v[5]，也就是4，再次递增i和j，这时候数组已经遍历完
     * 毕，结束。这时候j的值为3，刚好就是新的数组的长度。
     *
     */
    public int removeElement(int[] nums, int val) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        return j;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int length = s.removeElement(nums, val);
        System.out.println(length);

    }
}
