package com.example.lineartable;

/**
 * 波兰表达式 （中缀表达式）
 * 中缀表达式需要两个栈来存放，一个存档数字，一个存放字符
 * 判断优先级，出栈计算结果
 * 还没有完成呀呀呀呀呀呀呀哎呀------------
 */
public class PolandCalculate {
    public static void main(String[] args) {
        String s = "4*6+2+7";
        String address="上海^上海市@闵行区#吴中路";

        String[] splitAddress=address.split("\\^|@|#");
        System.out.println(splitAddress[0]+splitAddress[1]+splitAddress[2]+splitAddress[3]);
    }
}

class ArrayStack{
    public int[] arr;
    public int top = -1;
    public int maxSize;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
    }

    public boolean isFull(){
        if (top == maxSize -1 ){
            System.out.println("栈已满");
            return true;
        }
        return false;
    }

    public void push(int num){
        if (top == maxSize -1 ){
            System.out.println("栈已满");
            return;
        }
        top++;
        arr[top] = num;

    }

    public void pop(){
        if (top == -1 ){
            System.out.println("栈已空");
            return;
        }
        top--;

    }
}