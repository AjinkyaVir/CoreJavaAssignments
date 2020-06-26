package com.company.methodexamplenine;

public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(9,99,19);
        isTeen(25);
    }

    public static boolean hasTeen(int ageOne,int ageTwo,int ageThree) {
        if (ageOne >= 13 && ageOne <= 19){
            return true;
        }else if (ageTwo >= 13 && ageTwo <= 19){
            return true;
        }else if (ageThree >= 13 && ageThree <= 19){
            return true;
        } else
            return false;
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19){
            return true;
        }return false;
    }

}
