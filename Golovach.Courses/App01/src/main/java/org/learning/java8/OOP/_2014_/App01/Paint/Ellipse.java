package org.learning.java8.OOP._2014_.App01.Paint;

public class Ellipse implements Figure {
    public int x;
    public int y;
    public int radius;

    public Ellipse(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Ellipse");
    }

    @Override
    public void print() {
        System.out.println("Ellipse");
    }

    @Override
    public int left() {
        return x - radius;
    }
}
