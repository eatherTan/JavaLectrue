package com.example.thread;

//如果使用 PrintString ps = new PrintString();的方式执行printString()， 会出现死循环
//使用多线程可以解决死循环： PrintStringRun
public class PrintString implements Runnable{

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printString(){
        try{
            while (isContinuePrint == true){
                System.out.println("run printString threadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printString();
    }
}
