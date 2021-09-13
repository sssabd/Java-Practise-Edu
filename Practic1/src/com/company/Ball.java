package com.company;

public class Ball {
    private String color;
    private int numberOfStrips;

    public Ball(String color, int numberOfStrips) {
        this.color = color;
        this.numberOfStrips = numberOfStrips;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfStrips() {
        return numberOfStrips;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfStrips(int numberOfStrips) {
        this.numberOfStrips = numberOfStrips;
    }

    @Override
    public String toString() {
        return "This ball is " + this.color + " with " + this.numberOfStrips+ " strips";
    }
}