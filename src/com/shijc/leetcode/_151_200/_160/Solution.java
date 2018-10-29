package com.shijc.leetcode._151_200._160;

import com.shijc.leetcode.ListNode;

/**
 * 160. 相交链表
 * 160. Intersection of Two Linked Lists
 * 题目描述提示帮助提交记录社区讨论阅读解答
 * 编写一个程序，找到两个单链表相交的起始节点。
 * 例如，下面的两个链表：
 *
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * 在节点 c1 开始相交。
 *
 * 注意：
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        int diff = lengthA-lengthB;
        ListNode longNode = headA;
        ListNode shortNode = headB;

        if (lengthA<lengthB){
            diff = -diff;
            longNode = headB;
            shortNode = headA;
        }

        for (int i = 0; i < diff; i++) {
            longNode = longNode.next;
        }

        while (longNode!=null && shortNode!=null&& longNode!=shortNode){
            longNode = longNode.next;
            shortNode = shortNode.next;
        }

        ListNode result = longNode;
        return result;

    }


    private int getLength(ListNode listNode){
        int length = 0;
        while (listNode!=null){
            length++;
            listNode = listNode.next;
        }
        return length;
    }
}
