package com.company.methodoverloading.examplesix;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(-1,1,1);
    }

    public static void printEqual(int numberOne,int numberTwo,int numberThree) {
        if (numberOne < 0 || numberTwo  < 0 || numberThree < 0){
            System.out.println("Invalid Value");
        }else if (numberOne == numberTwo && numberTwo  == numberThree){
            System.out.println("All numbers are equal");
        }else if (numberOne != numberTwo && numberTwo  != numberThree && numberThree != numberOne){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

}
