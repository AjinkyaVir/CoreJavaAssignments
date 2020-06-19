package com.company.primitivetypechallenge;

public class Demo {

    public static void main(String[] args) {

        byte byteNumber = 127;
        int intNumber = 640000;
        short shortNumber = 32767;

        long longNumber = 50000L + 10L * (byteNumber + intNumber + shortNumber);

        System.out.println("Total addition is : " + longNumber);

    }

}
