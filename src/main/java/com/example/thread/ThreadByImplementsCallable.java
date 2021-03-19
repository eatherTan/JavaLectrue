package com.example.thread;

import java.util.concurrent.*;

/**
 * 1.实现Callable接口，需要返回值类型
 * 2.重写call方法，需要抛出异常
 * 3.创建目标对象
 * 4.创建线程执行服务： ExecutorService service = Executors.newFixedThreadPool(1);
 * 5.提交执行：Futrue<Boolean> result = service.submit();
 * 6.获取结果：Boolean r1 = result.get();
 * 7.关闭服务：service.shutdown();
 */
public class ThreadByImplementsCallable implements Callable<Boolean> {

    private String url;
    private String name;

    public ThreadByImplementsCallable(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader(url, name);
        System.out.println("下载了文件名为：" + name);
        return true;
    }

    public static void main(String[] args) {
        ThreadByImplementsCallable t1 = new ThreadByImplementsCallable("https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2763858159,801771131&fm=26&gp=0.jpg","图片1");
        ThreadByImplementsCallable t2 = new ThreadByImplementsCallable("https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2763858159,801771131&fm=26&gp=0.jpg","图片2");
        ThreadByImplementsCallable t3 = new ThreadByImplementsCallable("https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2763858159,801771131&fm=26&gp=0.jpg","图片3");

        //1.创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(3);
        //2.提交执行
        Future<Boolean> r1 = service.submit(t1);
        Future<Boolean> r2 = service.submit(t2);
        Future<Boolean> r3 = service.submit(t3);
        //3.获取结果
        try {
            boolean rs1 = r1.get();
            boolean rs2 = r2.get();
            boolean rs3 = r3.get();
            //4.关闭服务
            service.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
