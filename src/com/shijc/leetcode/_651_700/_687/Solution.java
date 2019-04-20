package com.shijc.leetcode._651_700._687;

import com.shijc.leetcode.TreeNode;

/**
 * 687. 最长同值路径
 * longest univalue path
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 *
 * 示例 1:
 *
 * 输入:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * 输出:
 *
 * 2
 * 示例 2:
 *
 * 输入:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * 输出:
 *
 * 2
 */
public class Solution {
    private int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null){
            return 0;
        }
        getLongPath(root);
        return max;
    }


    private int getLongPath(TreeNode root){
        int left = 0;
        int right = 0;
        if (root.left!=null && root.left.val == root.val){
            left = 1+getLongPath(root.left);
        }else if (root.left !=null){
            getLongPath(root.left);
        }

        if (root.right != null && root.right.val == root.val){
            right = 1+getLongPath(root.right);
        }else if (root.right !=null){
            getLongPath(root.right);
        }

        if (left +right>max){
            max = left+right;
        }

        return left>right?left:right;
    }
}
