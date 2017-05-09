package org.learning.java8.OOP._2014_.App01.Paint;

public class Rectangle implements Figure {
    public int centerX;
    public int centerY;
    public int width;
    public int height;

    public Rectangle(int centerX, int centerY, int width, int height) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    @Override
    public void print() {
        System.out.println("Rectangle");
    }

    @Override
    public int left() {
        return centerX - width / 2;
    }
}
