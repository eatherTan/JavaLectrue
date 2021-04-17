package com.example.leetcode;

/**
 *
 * 是否回文链表: 1.8 目前还有问题！参考一下答案
 */
public class L234IsPalindromeListNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(isPalindromeListNode(node1));
    }

    public static boolean isPalindromeListNode(ListNode head){

        ListNode middleNode = findMiddleNode(head);
        ListNode reverseHalfNode = reverseHalfNode(middleNode);
        ListNode temp = head;
        boolean isPalindrome = false;
        while (true){
            if (reverseHalfNode == null){
                isPalindrome = true;
                break;
            }
            if (temp.val == reverseHalfNode.val){
                if (temp == middleNode){
                    break;
                }
                temp = temp.next;
                reverseHalfNode = reverseHalfNode.next;
            }else {
                return false;
            }
        }
        return isPalindrome;
    }


    /**
     * 寻找中间节点
     * @param head
     * @return
     */
    private static ListNode findMiddleNode(ListNode head) {
        ListNode low = head, fast = head;
        while (true){
            if (fast == null || fast.next == null){
                break;
            }
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }

    /**
     * 反转后半部分链表
     * @param middleNode
     * @return
     */
    private static ListNode reverseHalfNode(ListNode middleNode) {
        ListNode cur = null, pre = middleNode;
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
