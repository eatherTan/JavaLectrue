package com.example.leetcode;

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
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(7);
        ListNode node7 = new ListNode(8);
        ListNode node8 = new ListNode(12);
        ListNode node9 = new ListNode(13);
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        getIntersectionNode(node1, node4);
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
                System.out.println(pA.val + "  "  + pA.next.val);
                pB = (pB == null) ? headA : pB.next;
            }
            return null;
        }

}
