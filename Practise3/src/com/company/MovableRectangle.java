package com.company;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint topRight;


    public MovableRectangle(int x1, int y1, int x2, int y2,
                            int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "TopLeft coords: (" + topLeft.x + ", " + topLeft.y
                + ") \nTopLeft coords: (" + topRight.x + ", " + topRight.y + ")";
    }

    @Override
    public void moveUp() {
        topRight.moveUp();
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        topRight.moveDown();
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        topRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topRight.moveRight();
        topLeft.moveRight();
    }
}
