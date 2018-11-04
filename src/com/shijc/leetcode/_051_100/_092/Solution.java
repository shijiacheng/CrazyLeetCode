package com.shijc.leetcode._051_100._092;


import com.shijc.leetcode.ListNode;

/**
 * 92. 反转链表 II 
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 说明: 1 ≤ m ≤ n ≤ 链表长度。
 * 示例:
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4 
 * 输出: 1->4->3->2->5->NULL
 * 
 * @author shijiacheng
 *
 */
public class Solution {
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) {
        	return head;
        }
        n = n-m;
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode pre = preHead;
        while(--m >0) {
        	pre = pre.next;
        }
        ListNode start = pre.next;
        while(n-- >0) {
        	ListNode p = start.next;
        	start.next = p.next;
        	p.next = pre.next;
        	pre.next = p;
        }
        return preHead.next;
		
    }
}
