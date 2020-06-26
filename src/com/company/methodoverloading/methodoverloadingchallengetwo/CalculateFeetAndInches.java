package com.company.methodoverloading.methodoverloadingchallengetwo;

public class CalculateFeetAndInches {

    public static void main(String[] args) {

        double centimeters = calculateFeetAndInchesToCentimeters(12,5);
        System.out.println(centimeters + " cm");

        double feet = calculateFeetAndInchesToCentimeters(15);
        System.out.println(feet);
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calculateFeetAndInchesToCentimeters(feet,remainingInches);
        }return -1;
    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0 || inches >= 0 && inches <= 12){
           double totalInches = inches + (feet * 12);
           double centimeters = totalInches * 2.54;
           return centimeters;
        }else {
            return -1;
        }

    }

}
