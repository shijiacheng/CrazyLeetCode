package com.shijc.leetcode._401_450._404;

import com.shijc.leetcode.TreeNode;

import java.util.Stack;

/**
 * 404.左叶子之和
 * sum of left leaves
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty() ){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()){
                root = stack.pop();
                if (root.left!=null&&root.left.left==null&&root.left.right==null){
                    sum+=root.left.val;
                }
                root = root.right;
            }
        }

        return sum;
    }
}
