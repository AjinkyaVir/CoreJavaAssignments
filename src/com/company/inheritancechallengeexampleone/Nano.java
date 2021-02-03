package com.company.inheritancechallengeexampleone;

public class Nano extends Car {

    private int roadServiceMonths;

    public Nano(int roadServiceMonths) {
        super("Nano", "2WD", 4, 4, 4, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        }else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else {
            changeGear(4);
        }

        if (newVelocity > 0){
            changedVelocity(newVelocity,getCurrentDirection());
        }

    }
}
