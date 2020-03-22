package com.example.innerclass.inner2;

public class MemberInner {
    private int a = 4;

    public class Inner2{
        public void dosomething(){
            int a = 5;
            //访问内部类成员
            System.out.println(a);
            //访问外部类成员
            System.out.println(MemberInner.this.a);
        }
    }
}
