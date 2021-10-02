package com.company;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.filled = false;
        this.color = "blue";
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    @Override
    abstract public String toString();
}