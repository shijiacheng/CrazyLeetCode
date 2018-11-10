package com.shijc.leetcode._251_300._257;

import com.shijc.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257.二叉树的所有路径
 * binary tree paths
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class Solution {

    /**
     * 二叉树先序遍历一下，递归把节点值挨个加入就好了
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        String path = "";
        getBinaryTreePath(root,result,path);

        return result;
    }

    private void getBinaryTreePath(TreeNode root,List<String> list,String path){
        path += root.val + " ";
        if (root.left == null && root.right == null){
            list.add(path.trim().replaceAll(" ","->"));
        }

        if (root.left!=null){
            getBinaryTreePath(root.left,list,path);
        }

        if (root.right!=null){
            getBinaryTreePath(root.right,list,path);
        }
    }
}
