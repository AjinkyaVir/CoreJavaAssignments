package com.company.assignmenttwo;

public class Test {

    void m1(){
        Demo demo = new Demo();
        System.out.println(demo.a);
        System.out.println(demo.b);
    }

    void m2(){
        Demo demo = new Demo();
        System.out.println(demo.a);
        System.out.println(demo.b);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        test.m2();
    }

}
