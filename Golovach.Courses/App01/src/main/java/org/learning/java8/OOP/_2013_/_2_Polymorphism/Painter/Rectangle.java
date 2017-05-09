package org.learning.java8.OOP._2013_._2_Polymorphism.Painter;

public class Rectangle implements Figure {
    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle : Center(" + getX() + " ; " + getY() + "); " +
                        "W = " + getWidth() + " H = " + getHeight());

    }

    @Override
    public int left() {
        return (getX() - getWidth()/2);
    }

    @Override
    public int right() {
        return (getX() + getWidth()/2);
    }

    @Override
    public int top() {
        return (getY() - getHeight()/2);
    }

    @Override
    public int bottom() {
        return (getY() + getHeight()/2);
    }

    private int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    private int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    private int getWidth() {
        return width;
    }

    private void setWidth(int width) {
        this.width = width;
    }

    private int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }
}
