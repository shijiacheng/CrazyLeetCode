package com.shijc.leetcode._401_450._445;

import com.shijc.leetcode.ListNode;

import java.util.Stack;

/**
 * 445. 两数相加 II
 * 给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。
 * 将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 进阶:
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 * 示例:
 * 输入: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出: 7 -> 8 -> 0 -> 7
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1!=null){
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2!=null){
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode result = new ListNode(0);
        while (!stack1.empty() || !stack2.empty()){
            if (!stack1.empty()){
               sum += stack1.pop();
            }
            if (!stack2.empty()){
                sum += stack2.pop();
            }
            result.val = sum%10;
            ListNode head = new ListNode(sum/10);
            head.next = result;
            result = head;
            sum = sum/10;
        }

        if (result.val == 0){
            return result.next;
        }else {
            return result;
        }

    }

    public static void main(String[] args){
        Solution s = new Solution();
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode r1 = new ListNode(5);
        ListNode r2 = new ListNode(6);
        ListNode r3 = new ListNode(4);

        r1.next = r2;
        r2.next = r3;
        ListNode result = s.addTwoNumbers(l1,r1);
        System.out.println(result.val);
    }
}
