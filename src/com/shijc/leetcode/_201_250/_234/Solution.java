package com.shijc.leetcode._201_250._234;

import com.shijc.leetcode.ListNode;

import java.util.Stack;

/**
 * 234.回文链表
 * palindrome inked list
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 */
public class Solution {
    /**
     * 思路：快慢指针，快指针一次从两步，慢指针一次一步，快指针走完的时候，慢指针整好走到中间
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }

        ListNode pFast = head;
        ListNode pSlow = head;

        Stack<Integer> stack = new Stack<>();

        while (pFast!=null && pFast.next!=null){
            stack.push(pSlow.val);
            pFast = pFast.next.next;
            pSlow = pSlow.next;
        }

        /**
         * 如果链表长度是奇数，那么跳过最中间的节点
         */
        if (pFast!=null){
            pSlow = pSlow.next;
        }

        while (pSlow!=null){

            int top = stack.pop();
            if (pSlow.val != top){
                return false;
            }
            pSlow = pSlow.next;
        }

        return true;

    }
}
