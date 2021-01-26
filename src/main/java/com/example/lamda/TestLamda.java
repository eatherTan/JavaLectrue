package com.example.lamda;

//推到lamda表达式

public class TestLamda {

    /**
     * 方法二：优化方式：使用静态内部类
     */
    static class Like2 implements ILike{
        @Override
        public void lamda() {
            System.out.println("i like lamda2");
        }
    }
    public static void main(String[] args) {
        //方法一： 使用这种方法较麻烦，需要另外创建类
        ILike like = new Like();
        like.lamda();

        //方法二：静态内部类
        like = new Like2();
        like.lamda();

        /**
         * 方法三：优化方式-局部内部类
         */
        class Like3 implements ILike{
            @Override
            public void lamda() {
                System.out.println("i like lamda3");
            }
        }

        like = new Like3();
        like.lamda();

        //方法四：匿名内部类:没有类的名称，必须借助接口或者父类
        like = new ILike() {
            @Override
            public void lamda() {
                System.out.println("i like lamda4");
            }
        };
        like.lamda();

        //方法五：用lamda简化,任何接口，如果只包含唯一一个抽象方法，那么它就是一个函数式接口
        //lamda表达式简化了匿名表达式
        like = ()->{
            System.out.println("i like lamda5");
        };
        like.lamda();

        //lamda 表达式还可以简化括号 ， 对应有参数的方法
//        like = a->{
//            System.out.println("i like lamda5");
//        };
//        like.lamda();
    }
}

interface ILike{
    void lamda();
    //void lamda(int a); //当有参数的时候
}

class Like implements ILike{

    @Override
    public void lamda() {
        System.out.println("i like lamda");
    }
}