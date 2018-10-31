package com.shijc.leetcode._101_150._101;

import com.shijc.leetcode.TreeNode;

/**
 * 101.对称二叉树
 * symmetric tree
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root,root);
    }

    private boolean isSymmetric(TreeNode left,TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }

        if (left.val != right.val){
            return false;
        }

        return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }
}
