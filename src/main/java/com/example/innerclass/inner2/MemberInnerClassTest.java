package com.example.innerclass.inner2;

public class MemberInnerClassTest {
    public static void main(String[] args) {
        MemberInner.Inner2 inner2 = new MemberInner().new Inner2();
        inner2.dosomething();
    }
}
