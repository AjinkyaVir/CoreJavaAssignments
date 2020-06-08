package com.company.assignmentfour;

public class Demo {

    int a =10,b=20;

    static void m1(){
        Demo demo = new Demo();
        System.out.println(demo.a); // call instance variable call by using Class name
        System.out.println(demo.b);
    }

    static void m2(){
        Demo demo = new Demo();
        System.out.println(demo.a);
        System.out.println(demo.b);
    }

    public static void main(String[] args) {
        Demo.m1();
        Demo.m2();
    }

}
