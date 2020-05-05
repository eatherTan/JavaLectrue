package com.example.leetcode;


/**
 * 合并两个链表：
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(7);
        ListNode node7 = new ListNode(8);
        ListNode node8 = new ListNode(12);
        ListNode node9 = new ListNode(13);
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        ListNode result = mergeTwoLists(node1, node4);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode prev = prehead;
        while (l1 != null && l2 != null){
            if ((l1.val <= l2.val) ){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;

    }
}
