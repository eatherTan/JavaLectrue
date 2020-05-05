package com.example.leetcode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */

public class DeleteRepeatNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode result = deleteDuplicates(node1);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            ListNode pre = head, curr = head.next;
            while (pre != null && curr != null) {
                if (pre.val == curr.val) {
                    pre.next = curr.next;
                    curr = curr.next;
                } else {
                    pre = pre.next;
                    curr = curr.next;
                }
            }
            return head;
        }
        return null;
    }

}
