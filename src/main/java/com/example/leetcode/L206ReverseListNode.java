package com.example.leetcode;

public class L206ReverseListNode {

    /**
     * 使用头插法反转链表
     */
    public static ListNode reverseList(ListNode head) {
        ListNode cur = null, pre = head;
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
}
