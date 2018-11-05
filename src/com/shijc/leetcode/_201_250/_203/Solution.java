package com.shijc.leetcode._201_250._203;

import com.shijc.leetcode.ListNode;

/**
 * 203.移除链表元素
 * remove linked list elements
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null){
            return null;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null){
            return null;
        }

        ListNode node = new ListNode(-1);
        node.next = head;

        while (head.next!=null){
            if (head.next.val == val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }

        return node.next;

    }
}
