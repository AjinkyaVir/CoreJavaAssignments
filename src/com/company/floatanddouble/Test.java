package com.company.floatanddouble;

public class Test {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value: " + myMinFloatValue + " Float max value : " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("double minimum value: " + myMinDoubleValue + " double max value : " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25d;

        System.out.println(myIntValue + myFloatValue + myDoubleValue);



    }

}
