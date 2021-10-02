package com.company;

public class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = 1;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.side + ", color: " + this.color;
    }
}
