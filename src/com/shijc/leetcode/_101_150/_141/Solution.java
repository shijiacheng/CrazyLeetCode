package com.shijc.leetcode._101_150._141;

import com.shijc.leetcode.ListNode;

/**
 * 141. 环形链表
 * 给定一个链表，判断链表中是否有环。
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }

        ListNode slow = head.next;
        if (slow == null){
            return false;
        }

        ListNode fast = slow.next;
        while (slow!=null && fast!=null){
            if (slow == fast){
                return true;
            }

            slow = slow.next;
            fast = fast.next;

            if (fast!= null){
                fast = fast.next;
            }
        }


        return false;
    }
}
