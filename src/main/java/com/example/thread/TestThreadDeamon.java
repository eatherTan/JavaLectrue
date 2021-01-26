package com.example.thread;

/**
 * 守护线程
 */
public class TestThreadDeamon {
    public static void main(String[] args) {

        God god = new God();
        Thread thread1 = new Thread(god);
        thread1.setDaemon(true);
        thread1.start();

        You you = new You();
        Thread thread2 = new Thread(you);
        thread2.start();
    }
}

class God implements Runnable{

    @Override
    public void run() {

        while (true){
            System.out.println("上帝守护者你");
        }
    }
}

class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("living happy!");
        }
    }
}