package com.example.lineartable;

/**
 * 环形链表
 * 约瑟夫环,约瑟夫问题 。。
 */
public class CircleLinkedList {
    //1/创建一个first 节点
    private Boy first = new Boy(-1);

    /**
     * 新增节点方法
     * @param num
     */
    //2.为环形链表添加节点：先让first 指向这个新节点，然后让他形成环形队列
    //3.然后新建一个新的节点temp，让temp 指向这个新增的节点； 原因是因为first不能动，需要新增一个辅助节点
    public void addBoy(int num){
        if (num < 1){
            System.out.println("编号不正确！");
            return;
        }
        Boy curBoy = null;
        for (int i = 1; i <= num; i++){
            //根据编号创建，小孩节点
            Boy boy = new Boy(i);
            if (i ==1){
                first = boy;
                boy.next = first;
                curBoy = boy;// 这里我想和老师的有一点点不一样，因为
            }else {
                curBoy.next = boy;
                boy.next = first;
                curBoy = boy;
            }
        }
    }



}

class Boy{
    public int no;
    public Boy next;

    public Boy(int no ){
        this.no = no;
    }

}