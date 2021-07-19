package com.example.leetcode;

public class L206ReverseListNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode node = reverseList(node1);
        ListNode newNode = reverseListNodeByRecursion(node);
        System.out.println(1);
    }
    /**
     * 使用头插法反转链表
     */
    public static ListNode reverseList(ListNode head) {
        ListNode cur = null, pre = head;  //cur = null; 第一步是把第一个节点的next设置为null
        while (true){
            if (pre == null){
                break;
            }
            ListNode temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;
        }
        return cur;
    }

    /**
     * 使用递归的方式反转链表
     */
    public static ListNode reverseListNodeByRecursion(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        //仔细思考：为什么反转后的链表要把头节点存起来
        //如果不用ListNode newHead = reverseListNodeByRecursion(head.next);  把头节点存起来，就会得到最后那个节点，但是因为进行了head.next = null;
        //所以在拿到最后那个节点时，也找不到其他节点了。head.next = null
        ListNode newHead = reverseListNodeByRecursion(head.next);
        head.next.next = head;
        head.next = null;//为了不形成环形链表
        return newHead;
    }
}
