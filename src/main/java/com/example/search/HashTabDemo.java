package com.example.search;

public class HashTabDemo {
    public static void main(String[] args) {

    }
}

//HashTab 来管理链表
class HashTab{
    private EmpLinkedList[] empLinkedListArray;
    private int size;

    public HashTab(int size) {
        this.size = size;
        //初始化链表数组的大小
        this.empLinkedListArray = new EmpLinkedList[size];
        //直接就能用这个数组了吗？
    }

    public void add(Emp emp){
        //根据员工id，添加到哪条链表
        int empLinkedListNo = hashFun(emp.id);
        //将emp 添加到对应链表中
        empLinkedListArray[empLinkedListNo].add(emp);
    }

    /**
     * 散列函数:使用取模法
     */
    public int hashFun(int id){
        return id % size;
    }

    public void list(){
        for (int i = 0; i < empLinkedListArray.length; i++) {
            empLinkedListArray[i].list();
        }
    }
}

//表示雇员
class Emp{
    public int id;
    public String name;
    public Emp next;
    public Emp(int id,String name){
        super();
        this.id = id;
        this.name = name;
    }
}

//表示链表
class EmpLinkedList{
    //头指针，指向第一个Emp
    private Emp head;  //默认为null

    //添加雇员时，id是自增长的
    public void add(Emp emp){
        //添加第一个节点
        if (head == null){
            head = emp;
            return;
        }
        Emp temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = emp;
    }

    public void list(){
        if (head == null){
            System.out.println("当前链表为空！");
            return;
        }
        Emp temp = head;
        while (true){
            System.out.println("-> id = " + temp.id + " -> name = " + temp.name);
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
    }
}