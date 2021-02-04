package com.company.poolchallengeinheritance;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }

        if (width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
