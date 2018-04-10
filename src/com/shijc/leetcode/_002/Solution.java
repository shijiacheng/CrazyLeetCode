package com.shijc.leetcode._002;

import com.shijc.leetcode.ListNode;

/**
 * 2.Add Two Numbers
 * 两数相加
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode preNode = result;
        int sum = 0;
        ListNode node1 = l1;
        ListNode node2 = l2;

        while (node1!=null || node2!=null || sum>0){
            ListNode node = new ListNode(0);
            int val1 = 0;
            if (node1 != null){
                val1 = node1.val;
                node1 = node1.next;
            }
            int val2 = 0;
            if (node2 !=null){
                val2 = node2.val;
                node2 = node2.next;
            }

            node.val = (val1+val2+sum)%10;
            sum = (val1+val2+sum)/10;

            preNode.next = node;
            preNode = node;
        }

        return result.next;
    }
}
