package com.company.methodoverloading.methodoverloadingexamplefour;

import java.io.Serializable;

public class AreaCalculator {

    public static void main(String[] args) {

        double circleRadius = area(-1);
        System.out.println(circleRadius);
        
        double rectangleArea = area(-1.0,4.0);
        System.out.println(rectangleArea);

    }

    private static double area(double x,double y) {
        if (x < 0 || y < 0){
            return -1.0;
        }else {
            return x * y;
        }
    }

    public static double area(double radius) {
        if (radius < 0){
            return -1.0;
        }else{
           return Math.PI * radius * radius;
        }
    }

}
