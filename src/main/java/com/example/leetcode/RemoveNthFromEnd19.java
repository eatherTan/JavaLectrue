package com.example.leetcode;

import java.util.List;

public class RemoveNthFromEnd19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(7);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        while (node1!= null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
        removeNthFromEnd(head,2);
        while (node1!= null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }
    /**
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     * 示例：
     * 给定一个链表: 1->2->3->4->5, 和 n = 2.
     * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
     *
     * 进阶：
     * 你能尝试使用一趟扫描实现吗？
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode first = dummyHead;
        ListNode second = dummyHead;
        int count = 0;
        while (first != null){
            first = first.next;
            count++;
            if (count>n-1){
                second = second.next;
            }
        }
        second.next = second.next.next;
        return dummyHead.next;
    }
}
