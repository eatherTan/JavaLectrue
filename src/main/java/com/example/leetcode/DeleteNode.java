package com.example.leetcode;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val){
            return head.next;
        }
        ListNode pre = head, curr = head.next;
        while (curr != null && curr.val != val){
            pre = pre.next;
            curr = curr.next;
        }
        if (curr.val == val){
            pre.next = curr.next;
        }
        return head;
    }

    public ListNode deleteNode1(ListNode head, int val) {
        if(head.val == val) {
            return head.next;
        }
        ListNode pre = head, cur = head.next;
        while(cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if(cur != null) {
            pre.next = cur.next;
        }
        return head;
    }

}
