package org.learning.java8.OOP._2013_._2_Polymorphism.Painter;

public class Circle implements Figure {

    private int x;
    private int y;
    private int radius;

    Circle(int x, int y, int radius) {
        this.setX(x);
        this.setY(y);
        this.setRadius(radius);
    }

    @Override
    public void draw() {
        System.out.println("Circle : Center(" + getX() + " ; " + getY() + "); " +
                "R = " + getRadius());

    }

    @Override
    public int left() {
        return (getX() - getRadius());
    }

    @Override
    public int right() {
        return (getX() + getRadius());
    }

    @Override
    public int top() {
        return (getY() - getRadius());
    }

    @Override
    public int bottom() {
        return (getY() + getRadius());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
