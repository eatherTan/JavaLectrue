package com.example.leetcode;

/**
 *
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */
public class L002TwoNumAdd {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node8 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node8;

        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(9);
        ListNode node11 = new ListNode(9);

        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node9;
        node9.next = node10;
        node10.next = node11;
        twoNumsAdd(node1,node4);
    }

    public static ListNode twoNumsAdd(ListNode l1 , ListNode l2){
        ListNode sumHead = new ListNode(-1);
        ListNode sumTemp = sumHead;
        int carry = 0;
        while (l1 != null || l2 != null){
            int val1 = l1!=null ? l1.val : 0;
            int val2 = l2!=null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            sumTemp.next = new ListNode(sum%10 );
            carry = sum/10;    //重要！！
            l1 = l1!=null ? l1.next : null;
            l2 = l2!=null ? l2.next : null;
            sumTemp = sumTemp.next;
        }
        if (carry > 0){     //重要！！！
            sumTemp.next = new ListNode(carry );
        }
        return sumHead.next;
    }
}
