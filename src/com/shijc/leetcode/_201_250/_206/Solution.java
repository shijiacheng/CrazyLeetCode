package com.shijc.leetcode._201_250._206;


import com.shijc.leetcode.ListNode;

/**
 * 206.反转链表
 * Reverse Linked List
 * 反转一个单链表。
 * 示例:
 * 输入: 1->2->3->4->5->NULL 
 * 输出: 5->4->3->2->1->NULL
 * 
 * @author shijiacheng
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode next = null;

		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}

		return pre;
	}
}
