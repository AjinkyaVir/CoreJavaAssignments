package com.company.methodexampleeight;

public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1,1,1);
    }

    public static boolean hasEqualSum(int numberOne,int numberTwo,int numberThree) {
        if (numberOne + numberTwo == numberThree){
            return true;
        }
        return false;
    }

}
