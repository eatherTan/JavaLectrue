package com.example.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThreadDownImages extends Thread{
    private String url;
    private String name;

    public TestThreadDownImages(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader(url,name);
        System.out.println("下载了文件名为：" + name);
    }

    public static void main(String[] args) {
        TestThreadDownImages t1 = new TestThreadDownImages("https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2763858159,801771131&fm=26&gp=0.jpg","图片1");
        TestThreadDownImages t2 = new TestThreadDownImages("https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2763858159,801771131&fm=26&gp=0.jpg","图片2");
        TestThreadDownImages t3 = new TestThreadDownImages("https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2763858159,801771131&fm=26&gp=0.jpg","图片3");
        t1.start();
        t2.start();
        t3.start();
        //每次运行可知，每次下载的顺序是不固定的，但是线程start()以后，线程都是同时执行的，但是具体执行谁，要通过CPU来调度
    }
}

class WebDownLoader{


    public void downLoader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，上传图片异常");
        }
    }
}