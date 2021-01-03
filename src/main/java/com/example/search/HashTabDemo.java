package com.example.search;

import java.util.Scanner;

public class HashTabDemo {
    public static void main(String[] args) {

        HashTab hashTab = new HashTab(7);
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("***************菜单****************");
            System.out.println("1-add");
            System.out.println("2-list");
            System.out.println("3-find");
            System.out.println("4-exit");
            System.out.println("请输入要操作的序号");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println("请输入要员工序号");
                    Scanner idScanner = new Scanner(System.in);
                    int id = idScanner.nextInt();
                    System.out.println("请输入要员工名称");

                    Scanner nameScanner = new Scanner(System.in);
                    String name = nameScanner.next();
                    Emp emp = new Emp(id,name);
                    hashTab.addByOrder(emp);
                    break;
                case "2":
                    hashTab.list();
                    break;
                case "3":
                    System.out.println("请输入要要查找的员工id");
                    idScanner = new Scanner(System.in);
                    int id1 = idScanner.nextInt();
                    hashTab.findEmployeeById(id1);
                    break;
                case "4":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }


        /**
         * 单独测试是正确的！！但是放在链表中却不能正常按照顺序添加节点
         * 第2链表信息为：-> id = 1 name = tan;
         * -> id = 2 name = tan2;
         * -> id = 4 name = tan4;
         * -> id = 5 name = tan5;
         * -> id = 8 name = tan8;
         */

        /*EmpLinkedList ll = new EmpLinkedList();
        Emp emp1 = new Emp(1,"tan");
        Emp emp2 = new Emp(8,"tan8");
        Emp emp3 = new Emp(2,"tan2");
        Emp emp4 = new Emp(5,"tan5");
        Emp emp5 = new Emp(4,"tan4");
        ll.addByOrder(emp1);
        ll.addByOrder(emp2);
        ll.addByOrder(emp3);
        ll.addByOrder(emp4);
        ll.addByOrder(emp5);
        ll.list(1);*/
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
        //直接就能用这个数组了吗？这里有个坑
        //这是不要忘了!!!!! 分别初始化每一个链表
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

    public void add(Emp emp){
        //根据员工id，添加到哪条链表
        int empLinkedListNo = hashFun(emp.id);
        //将emp 添加到对应链表中
        empLinkedListArray[empLinkedListNo].add(emp);
    }

    public void addByOrder(Emp emp){
        //根据员工id，添加到哪条链表
        int empLinkedListNo = hashFun(emp.id);
        //将emp 添加到对应链表中
        empLinkedListArray[empLinkedListNo].addByOrder(emp);
    }
    /**
     * 散列函数:使用取模法
     */
    public int hashFun(int id){
        return id % size;
    }

    public void list(){
        for (int i = 0; i < empLinkedListArray.length; i++) {
            empLinkedListArray[i].list(i);
        }
    }

    public Emp findEmployeeById(int id){
        int empLinkedList = hashFun(id);
        Emp emp = empLinkedListArray[empLinkedList].find(id);
        if (emp != null){
            System.out.printf("在第 %d 条链表中找到该雇员", empLinkedList+1);
        }
        return emp;
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

    /**
     * 添加雇员
     * @param emp
     */
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

    /**
     * 添加的元素是无序的，添加节点为有序的链表
     * 这个按照顺序来插入元素单独测试是没有问题的，为什么放到HashTab 就有问题？？
     * @param emp
     */
    public void addByOrder(Emp emp){
        //添加第一个节点
        if (head == null){
            head = emp;
            return;
        }
        Emp temp = new Emp(-1,"");
        temp.next = head; //这里
        boolean flag = false;
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.id > emp.id){
                emp.next = temp.next;
                temp.next = emp;
                flag =true;
                return;
            }
            temp = temp.next;
        }
        if (!flag){
            temp.next = emp;
        }
    }


    /*public void insert(Node head, Node newnode) {
        boolean inserted = false;
        if (head == null)
            head = newnode;
        if (head.next == null)
            head.next = newnode;
        while (head.next != null) {
            if (head.next.value > newnode.value) {
                Node temp = head.next;
                head.next = newnode;
                newnode.next = temp;
                inserted = true;
                break;
            }else
                head = head.next;
            if (flag = false)
                head.next = newnode;

        }
    }*/

    /**
     * 展示全部雇员
     */
    public void list(int i){
        if (head == null){
            System.out.println("第"+ (i+1) + "链表为空！");
            return;
        }
        System.out.print("第"+ (i+1) + "链表信息为：");
        Emp temp = head;
        while (true){
            System.out.println("-> id = " + temp.id + " name = " + temp.name + "; ");
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * 查找雇员
     * @param id
     * @return
     */
    public Emp find(int id){
        if (head == null){
            System.out.println("当前链表为空！");
            return null;
        }
        Emp temp = head;
        boolean hasFind = false;
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.id == id){
                hasFind = true;
                return temp;
            }
            temp = temp.next;
        }
        if (hasFind == false){
            System.out.println("不存在该员工");
        }
        return null;
    }
}