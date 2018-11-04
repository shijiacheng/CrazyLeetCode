package com.shijc.leetcode._101_150._107;

import com.shijc.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 107.二叉树的层次遍历 II
 * binary tree level order traversal ii
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int number = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < number; i++) {

                if (queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }

                if (queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                list.add(queue.poll().val);
            }

            result.add(0,list);
        }

        return result;


    }
}
