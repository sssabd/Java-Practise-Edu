package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); //экземляр родительского класса
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return this.length * this.width;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + this.width
                + ", length:" + this.length + ", color: " + this.color;
    }
}
