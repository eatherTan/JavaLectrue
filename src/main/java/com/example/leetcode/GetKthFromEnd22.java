package com.example.leetcode;

/**
 *
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * 返回链表 4->5.
 *
 */
public class GetKthFromEnd22 {

    /**
     * 双指针法：快指针先走k步，慢指针再走，当快指针走到尾巴的时候，慢指针指在
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, low = head;
        while (k > 0){ //fast先走
            if (fast == null){
                return null;
            }
            fast = fast.next;
            k--;
        }
        while (true){ //low再走
            if (fast == null){
                break;
            }
            fast = fast.next;
            low = low.next;
        }
        return low;
    }
}
