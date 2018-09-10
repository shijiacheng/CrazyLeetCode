package com.shijc.leetcode._019;

import com.shijc.leetcode.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n` 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode last = first;
        ListNode slow = first;

        for (int i = 0; i < n+1; i++) {
            if (last.next!=null){
                last = last.next;
            }else {
                last = null;
            }
        }

        while (last!=null){
            slow = slow.next;
            last = last.next;
        }

        slow.next = slow.next.next;

        return first.next;



    }

    public static void main(String[] args){
        Solution s = new Solution();
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        ListNode result = s.removeNthFromEnd(head1,2);
        System.out.println(result.val);
    }
}
