package com.shijc.leetcode._001_050._021;

import com.shijc.leetcode.ListNode;

/**
 * 21. Merge Two Sorted Lists
 * 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Solution {
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
}
