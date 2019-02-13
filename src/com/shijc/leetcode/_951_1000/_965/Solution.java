package com.shijc.leetcode._951_1000._965;

import com.shijc.leetcode.TreeNode;

/**
 * 965. 单值二叉树
 * univalued binary tree
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 *
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 * 示例 2：
 *
 *
 *
 * 输入：[2,2,2,5,2]
 * 输出：false
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return dfs(root,root.val);
    }

    private boolean dfs(TreeNode root,int val){
        if (root!=null){
            return true;
        }
        if (root.val != val){
            return false;
        }
        return dfs(root.left,val)&&dfs(root.right,val);
    }
}
