package com.example.leetcode;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个链表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 *
 */
public class FindCommonNode160 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(7);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node5;

        ListNode node4 = new ListNode(2);

        ListNode node6 = new ListNode(7);
        ListNode node7 = new ListNode(8);
        ListNode node8 = new ListNode(12);
        ListNode node9 = new ListNode(13);
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        ListNode resultNode = getIntersectionNode(node1, node4);
        System.out.println(resultNode.val);  //共有节点是node5
    }

        public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            //方法一 ： 使用Set
            // Set<ListNode> set = new HashSet<>();
            // while(headA != null){
            //     set.add(headA);
            //     headA = headA.next;
            // }
            // while(headB != null){
            //     if(set.contains(headA)){
            //         return headB;
            //     }
            //     set.add(headB);
            //     headA = headB.next;
            // }
            // return null;
            //方法二
            if(headA == null || headB == null){
                return null;
            }
            ListNode pA = headA, pB = headB;
            int length = 0;
            while(pA != null){
                length ++;
                pA = pA.next;
            }
            while(pB != null){
                length ++;
                pB = pB.next;
            }

            pA = headA;
            pB = headB;
            for(int i = 0; i < length; i++){
                if(pA == pB){
                    return pA;
                }
                pA = (pA == null) ? headB : pA.next;
                pB = (pB == null) ? headA : pB.next;
            }
            return null;
        }

}
