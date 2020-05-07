package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReturnBeforeValue {

    public static void main(String[] args) {

    }

    /**
     * 一个单向链表，每个节点上都有一个value；给定 一个 value，将该 value 之前的所有 value返回
     * @param node
     * @param value
     * @return
     */
    public static List returnBeforeValue(ListNode node, int value){
        List<Integer> list = new ArrayList<>();
        if (node.val == value){
            return null;
        }
        while (node.val != value){
            list.add(node.val);
            node = node.next;
        }
        return list;
    }
}
