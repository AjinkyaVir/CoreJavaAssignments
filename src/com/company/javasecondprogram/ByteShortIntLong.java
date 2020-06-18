package com.company.javasecondprogram;

public class ByteShortIntLong {

    public static void main(String[] args) {

        int myValue = 1000;

        /*int occupies the 32 bits. we can say int has width 32*/
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("My int minimum value: " + myMinIntValue);
        System.out.println("My int maximum value: " + myMaxIntValue);

        /*byte occupies the 8 bits. we can say byte has width 8*/
        byte myByteMaxValue = Byte.MAX_VALUE;
        byte myByteMinValue = Byte.MIN_VALUE;

        System.out.println("My byte minimum value: " + myByteMaxValue);
        System.out.println("My byte maximum value: " + myByteMinValue);

        /*short occupies the 16 bits. we can say short has width 16*/
        short myShortMaxValue = Short.MAX_VALUE;
        short myShortMinValue = Short.MIN_VALUE;

        System.out.println("My short minimum value: " + myShortMaxValue);
        System.out.println("My short maximum value: " + myShortMinValue);

        /*long occupies the 64 bits. we can say long has width 64*/
        long myLongValue = 100L;

        long myLongMaxValue = Long.MAX_VALUE;
        long myLongMinValue = Long.MIN_VALUE;

        System.out.println("My long minimum value: " + myLongMaxValue);
        System.out.println("My long maximum value: " + myLongMinValue);

        long bigLongValue = 2_147_483_647L;
        System.out.println(bigLongValue);

    }

}
