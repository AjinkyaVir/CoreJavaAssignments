package com.company.methodexamplefour;

public class MilePerHour {

    public static void main(String[] args) {

        printConversion(10.6);
        double miles = toMilePerHour(10.6);
        System.out.println("Miles = " + miles);

    }

    private static long toMilePerHour(double kiloMeterPerHour) {
        if (kiloMeterPerHour < 0){
            return  -1;
        }
        return Math.round(kiloMeterPerHour / 1.609);
    }

    private static void printConversion(double kiloMeterPerHour) {
       if (kiloMeterPerHour < 0){
           System.out.println("Invalid Value");
       }else{
           long milesPerHour = toMilePerHour(kiloMeterPerHour);
           System.out.println(kiloMeterPerHour +
                   " km/h = " + milesPerHour +
                   " mi/h");
       }
    }


}
