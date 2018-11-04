package com.shijc.leetcode._051_100._083;


import com.shijc.leetcode.ListNode;

/**
 * 83. 删除排序链表中的重复元素 
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * 示例 1:
 * 输入: 1->1->2 
 * 输出: 1->2 
 * 示例 2:
 * 输入: 1->1->2->3->3 
 * 输出: 1->2->3
 * 
 * @author shijiacheng
 *
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
	    while (current != null && current.next != null) {
	        if (current.next.val == current.val) {
	            current.next = current.next.next;
	        } else {
	            current = current.next;
	        }
	    }
	    return head;
    }
	
	
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode result = s.deleteDuplicates(node1);
		System.out.println(result.val);
	}
}
