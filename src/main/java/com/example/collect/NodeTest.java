package com.example.collect;

public class NodeTest {

    public static void main(String[] args) {
        Node node1  = new Node();
        Node node2  = new Node();
        Node node3  = new Node();
        Node node4  = new Node();
        node1.data = "1";
        node1.next = node2;

        node2.data = "2";
        node2.next = node3;

        node3.data = "3";
        node3.next = null;
        //插入
        node4.data = "4";
        node1.next = node4;

        node4.next = node2;

        System.out.println(node1.next.data);

        //删除
        node1.next = node2;
        node4.next = null;
        System.out.println(node1.next.data);
    }
}
