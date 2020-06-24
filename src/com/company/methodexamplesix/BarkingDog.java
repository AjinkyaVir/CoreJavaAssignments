package com.company.methodexamplesix;

public class BarkingDog {

    public static void main(String[] args) {

        shouldWakeUp(false,21);

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (!barking || (hourOfDay > 23 || hourOfDay < 0)) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }

}
