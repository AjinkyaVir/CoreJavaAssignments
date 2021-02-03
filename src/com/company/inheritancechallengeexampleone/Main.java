package com.company.inheritancechallengeexampleone;

public class Main {

    public static void main(String[] args) {
        Nano nano = new Nano(36);
        nano.steer(45);
        nano.accelerate(30);
        nano.accelerate(20);
        nano.accelerate(-42);
    }

}
