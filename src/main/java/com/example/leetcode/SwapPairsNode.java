package com.example.leetcode;


public class SwapPairsNode {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode result = swapPairs(node1);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    /**
     * 交换相邻的两个节点
     * @param head
     * @return
     */
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode prevNode  = dummy;
        while (head != null && head.next  != null){

            ListNode pre = head;
            ListNode curr = head.next;

            prevNode.next = curr;
            pre.next = curr.next;
            curr.next = pre;

            prevNode = pre;
            curr = curr.next;
            System.out.println(pre.val);
        }
        return dummy.next;
    }

    public  ListNode swapPairs2(ListNode head) {
        while (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(-1);
        ListNode res = node;
        while (head != null && head.next != null) {
            node.next = head.next;
            head.next = head.next.next;
            node.next.next = head;

            node = node.next.next;
            head = head.next;

        }
        return res.next;
    }

}
