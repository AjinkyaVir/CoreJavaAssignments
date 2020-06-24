package com.company.methodexamplethree;

public class Demo {

    public static void main(String[] args) {

        /*Write a method called checkNumber with an int parameter number
        * Method should not return any value
        * "positive" if the parameter number is > 0
        * "negative" if the parameter number is < 0
        * "zero" if the parameter number equal to 0
        * */

        checkNumber(5);


    }

    private static void checkNumber(int number) {

        if (number > 0){
            System.out.println("Number is positive");
        }else if (number < 0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");
        }


    }

}
