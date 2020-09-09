package com.example.lineartable;

/*
 线性表
 */
public class MySingleLinked {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"宋江11","及时雨234");
        singleLinkedList.addNode(hero1);
        singleLinkedList.addNode(hero2);
        singleLinkedList.showList();
    }
}

//定义 SingleLinkedList 管理英雄
class SingleLinkedList{
    private HeroNode head = new HeroNode(0,"","");

    //添加节点，第一种方式，添加到链表尾部
    public void addNode(HeroNode newNode){
        if (head.next == null){
            head.next = newNode;
        }else {
            HeroNode temp = head.next;
            while (temp != null) {
                if (temp.next == null) {
                    temp.next = newNode;
                    break;
                }
                temp = temp.next; //后移一个位置
            }
        }
    }

    //第二种添加节点的方式：按照no的大小来排序
    public void addByOrder(HeroNode newNode){
        if (head.next == null){
            head.next = newNode;
        }else {
            HeroNode temp = head.next;
            while (temp != null){
                if (temp.no == newNode.no){

                }
                if (temp.no < newNode.no && temp.no > newNode.no){
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
            }
        }
    }
    //展示链表的信息
    public void showList(){
        HeroNode temp = head;
        while (temp.next != null){
            System.out.println(temp.next.no + " " + temp.next.name + " " + temp.next.nickname);
            temp = temp.next;
        }
    }
}
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

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
