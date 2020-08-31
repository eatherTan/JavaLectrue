package com.example.lineartable;

/*
 线性表
 */
public class MySingleLinked {

//定义 SingleLinkedList 管理英雄
class SingleLinkedList{
    private HeroNode head = new HeroNode(0,"","");
    //添加节点
    public void addNode(){

    }
}


class HeroNode {
    private int no;
    private String name;
    private String nickname;
    private HeroNode next;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", next=" + next +
                '}';
    }
}

}