package com.shijc.leetcode._001_050._023;


import com.shijc.leetcode.ListNode;

/**
 * 23.Merge K sorted Lists
 * 合并K个排序链表
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * 示例:
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 */
public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0){
            return null;
        }
        if (lists.length == 1){
            return lists[0];
        }

        int begin = 0;
        int end = lists.length - 1;
        while (end>0){
            begin = 0;
            while (begin<end){
                lists[begin] = mergeTwoLists(lists[begin],lists[end]);
                begin++;
                end--;
            }
        }

        return lists[0];
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode mergeNode = null;
        if (l1.val > l2.val) {
            mergeNode = l2;
            mergeNode.next = mergeTwoLists(l1, l2.next);
        } else {
            mergeNode = l1;
            mergeNode.next = mergeTwoLists(l1.next, l2);
        }

        return mergeNode;
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(5);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        node2.next.next = new ListNode(7);

        ListNode node3 = new ListNode(3);
        node3.next = new ListNode(5);


        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = node1;
        listNodes[1] = node2;
        listNodes[2] = node3;

        Solution solution = new Solution();
        ListNode result = solution.mergeKLists(listNodes);

    }
}
