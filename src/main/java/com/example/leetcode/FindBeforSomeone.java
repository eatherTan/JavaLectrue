package com.example.leetcode;

import java.util.List;
//手写代码：一个单向链表，每个节点上都有一个value；给定 一个 value，将该 value 之前的所有 value返回

public class FindBeforSomeone {
    public static void main(String[] args) {
        ListNode node = new ListNode(0);

        ListNode temp = node;
        for (int i = 1; i < 4; i++) {
            ListNode newNode = new ListNode(i);
            node.next = newNode;
            node = node.next;
        }
        System.out.println();
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        ListNode head = node; //头结点
        System.out.println(findNode(1,head));
    }
    /**
     * 返回一个
     * @param value
     * @param head
     * @return
     */
    public ListNode listNode(int value, ListNode head){
        return null;
    }
    /**
     * 从头节点找起，是否值为value的节点
     * @param value
     * @param head
     */
    public static boolean findNode(int value, ListNode head){
        boolean flag = false;
        if (head == null){
            return flag;
        }
        ListNode temp = head;
        while (true){
            if (temp != null && temp.val == value){
                flag = true;
                return flag;
            }
            if (temp == null){
                return flag;
            }
            temp = temp.next;
        }
    }

    public void showList(){

    }
}
