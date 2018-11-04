package com.shijc.leetcode._101_150._112;

import com.shijc.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 112.路径总和
 * path sum
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        int currentSum = 0;
        hasPathSum(root,sum,currentSum,stack,result);
        if (result.size()>0){
            return true;
        }else {
            return false;
        }


    }

    private void hasPathSum(TreeNode root, int sum, int currentSum,
                            Stack<Integer> stack, List<List<Integer>> result) {

        currentSum += root.val;
        stack.push(root.val);

        boolean isLeaf = root.left == null && root.right == null;
        if (currentSum == sum && isLeaf){
            List<Integer> path = new ArrayList<>();
            for (Integer x : stack) {
                path.add(x);
            }
            result.add(path);
        }

        if (root.left!=null){
            hasPathSum(root.left,sum,currentSum,stack,result);
        }

        if (root.right!=null){
            hasPathSum(root.right,sum,currentSum,stack,result);
        }

        currentSum -= root.val;
        stack.pop();

    }
}
