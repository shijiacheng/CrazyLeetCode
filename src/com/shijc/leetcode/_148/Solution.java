package com.shijc.leetcode._148;

import com.shijc.leetcode.ListNode;

/**
 * 148.排序链表
 * sort list
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 *
 * 示例 1:
 *
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * 示例 2:
 *
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 */
public class Solution {

    /**
     * 主要考察3个知识点，
     * 知识点1：归并排序的整体思想
     * 知识点2：找到一个链表的中间节点的方法
     * 知识点3：合并两个已排好序的链表为一个新的有序链表
     *
     * 归并排序的基本思想是：找到链表的middle节点，然后递归对前半部分和后半部分分别进行归并排序，
     * 最后对两个以排好序的链表进行Merge。
     */
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        ListNode middle = getMiddleNode(head);
        ListNode next = middle.next;
        middle.next = null;
        return mergeTwoSortList(sortList(head),sortList(next));
    }


    /**
     * 找到链表的中间节点
     * @param head
     * @return
     */
    private ListNode getMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 合并两个排序的链表
     */
    private ListNode mergeTwoSortList(ListNode headA,ListNode headB){
        ListNode node = new ListNode(-1);

        ListNode cur = node;

        while (headA!=null &&headB!=null){

            if (headA.val<headB.val){
                cur.next = headA;
                headA = headA.next;
                cur = cur.next;
            }else {
                cur.next = headB;
                headB = headB.next;
                cur = cur.next;
            }
        }

        if (headA == null){
            cur.next = headB;
        }else {
            cur.next = headA;
        }

        return node.next;
    }

    public static void main(String[] args){
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(5);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(0);

        ListNode head = new ListNode(-1);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        Solution s = new Solution();
        ListNode result = s.sortList(head.next);

        System.out.println(result.val);
    }
}
