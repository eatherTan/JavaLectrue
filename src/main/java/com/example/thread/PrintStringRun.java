package com.example.thread;

public class PrintStringRun {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("我要停止它！stopThread=" +Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }

}
