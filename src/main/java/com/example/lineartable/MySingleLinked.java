package com.example.lineartable;

/*
 线性表
 */
public class MySingleLinked {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"宋江11","及时雨234");
        HeroNode hero3 = new HeroNode(3,"宋江33","及时雨234");
        HeroNode hero4 = new HeroNode(3,"宋江33","及时雨234");
        HeroNode hero5 = new HeroNode(2,"宋江33","及时雨234");
//        singleLinkedList.addNode(hero1);
//        singleLinkedList.addNode(hero2);
        singleLinkedList.addByOrder2(hero2);
        singleLinkedList.addByOrder2(hero1);
        singleLinkedList.addByOrder2(hero4);
        singleLinkedList.addByOrder2(hero5);
        singleLinkedList.addByOrder2(hero3);

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
            /**
             * 第一种添加节点的方式，我自己写的，有点冗余。
             */
            /*
            HeroNode temp = head.next;
            while (temp != null){
                if (temp.no == newNode.no){
                    System.out.printf("该%d英雄已经存在 \n",newNode.name);
                    break;
                }
                if (temp.no < newNode.no && temp.next != null && temp.next.no > newNode.no){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }else if (temp.no < newNode.no && temp.next == null){
                    temp.next = newNode;
                    break;
                }else if (temp.no > newNode.no){
                    newNode.next = temp;
                    head.next = newNode;
                }
                temp = temp.next;
            }*/
            /**
             * 第二种方式
             * 自己写的这些if，很冗余，思考角度很容易遗漏：插入节点在头部、中间、尾部三种情况
             * 没有老师的好
             */
            HeroNode temp = head;
            boolean flag = false;  //判断编号是否已经存在
            while (true){
                if (temp.next == null){
                    break;
                }
                if (temp.next != null && temp.next.no > newNode.no){
                    break;
                }else if (temp.next.no == newNode.no){
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if (flag){
                System.out.printf("准备插入的影响编号 %d已经存在了，不能插入", newNode.no);
            }else {
                newNode.next = temp.next;
                temp.next = newNode;
            }

        }
    }

    public void addByOrder2(HeroNode newNode){
        if (head.next == null){
            head.next = newNode;
        }else {
            /**
             * 第二种方式
             * 自己写的这些if，很冗余，思考角度很容易遗漏：插入节点在头部、中间、尾部三种情况
             * 没有老师的好
             */
            HeroNode temp = head;
            boolean flag = false;  //加入
            while (true){
                if (temp.next == null){
                    break;
                }
                if (temp.next != null && temp.next.no >= newNode.no){
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if (flag){
                newNode.next = temp.next;
                temp.next = newNode;
            }else {
                temp.next = newNode;
            }
        }
    }
    //删除结点
    public void deleteNode(HeroNode node){
        HeroNode temp = head;
        boolean flag = false; // 是否找到了相应的节点
        while (true){
            if (temp.no == node.no ){
                flag = true;
                break;
            }
        }
    }
    //展示链表的信息
    public void showList(){
        HeroNode temp = head;
        while (temp.next != null){
            System.out.println(temp.next.no + " " + temp.next.name + " " + temp.next.nickname + " \n");
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
