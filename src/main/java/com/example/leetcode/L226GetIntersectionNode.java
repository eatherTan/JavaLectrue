package com.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 *
 * 示例 2：
 * 输入：intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * 输出：Reference of the node with value = 2
 * 输入解释：相交节点的值为 2 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [0,9,1,2,4]，链表 B 为 [3,2,4]。在 A 中，相交节点前有 3 个节点；在 B 中，相交节点前有 1 个节点。
 *
 * 示例 3：
 * 输入：intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * 输出：null
 * 输入解释：从各自的表头开始算起，链表 A 为 [2,6,4]，链表 B 为 [1,5]。由于这两个链表不相交，所以 intersectVal 必须为 0，而 skipA 和 skipB 可以是任意值。
 * 解释：这两个链表不相交，因此返回 null。
 *
 * 注意：
 * 如果两个链表没有交点，返回 null 。
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 */
public class L226GetIntersectionNode {
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
        if (resultNode!=null) {
            System.out.println(resultNode.val);  //共有节点是node5
        }else {
            System.out.println("null");
        }
        //第二种方法测试：
        ListNode resultNode2 = getIntersectionNode2(node1, node4);
        if (resultNode!=null) {
            System.out.println(resultNode2.val);  //共有节点是node5
        }else {
            System.out.println("null");
        }
    }

    /**
     *
     * 方法一：用Set,先把第一条链表的值全部加入到set中，再遍历第二条链表，判断set中是否有存在对应节点了
     * 存在则返回，不存在则往后移动
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA,tempB = headB;

        Set<ListNode> set = new HashSet<>();
        while (true){
            if (tempA == null){
                break;
            }
            set.add(tempA);
            tempA = tempA.next;
        }
        while (true){
            if (tempB == null){
                break;
            }
            if (set.contains(tempB)){
                return tempB;
            }else {
                tempB = tempB.next;
            }
        }
        return null;
    }

    /**
     * 方法二：使用双指针的方式
     */
    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode tempA = headA,tempB = headB;
        while (tempA != tempB){
           tempA = tempA==null ? headB : tempA.next;
           tempB = tempB==null ? headA : tempB.next;
        }
        return tempA;
    }

}
