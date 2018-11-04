package com.shijc.leetcode._101_150._108;

import com.shijc.leetcode.TreeNode;

/**
 * 108.将有序数组转换为二叉搜索树
 * convert sorted array to binary search tree
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class Solution {

    /**
     * 因为给定的数组是按照升序排列的，所以可以先取出数组中间位置的值作为二叉查找树的根结点，
     * 然后以该数组中间位置的值为中心，将左边的数组划分到根结点的左子树中，右边的数组划分到
     * 根结点的右子树中，这样就能保证根结点的左子树上任意结点的值都小于根结点的值，右子树上
     * 任意结点的值大于根节点的值。接下来，可以使用递归地方法继续取出左边数组的中间值作为根
     * 结点的左子结点，右边数组的中间值作为根结点的右子结点，然后以左边数组中间值为中心，再
     * 次划分左右子树，右边数组同理，如此递归下去，对于每个结点，总是能保证其左子树上任意结
     * 点的值都要小于该节点的值，其右子树上任意结点的值都要大于该节点的值。
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0){
            return null;
        }

        return sortedArrayToBST(nums,0,nums.length-1);
    }


    private TreeNode sortedArrayToBST(int[] nums,int left,int right) {
        if (left>right){
            return null;
        }

        int middle = (left+right)/2;
        TreeNode node = new TreeNode(nums[middle]);

        node.left = sortedArrayToBST(nums,left,middle-1);
        node.right = sortedArrayToBST(nums,middle+1,right);
        return node;

    }
}
