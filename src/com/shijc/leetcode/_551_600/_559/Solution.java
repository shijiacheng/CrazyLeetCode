package com.shijc.leetcode._551_600._559;

import java.util.List;

/**
 * 559. N叉树的最大深度
 * maximum depth of n ary tree
 * 给定一个 N 叉树，找到其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * 例如，给定一个 3叉树 :
 *
 *
 *
 *
 *
 *
 *
 * 我们应返回其最大深度，3。
 */
public class Solution {
    public int maxDepth(Node root) {
        if (root == null){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < root.children.size(); i++) {
            result = Math.max(result,maxDepth(root.children.get(i)));
        }

        return result+1;
    }



    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
