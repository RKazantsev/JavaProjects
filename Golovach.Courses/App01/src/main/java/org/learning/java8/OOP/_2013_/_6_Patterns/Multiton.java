package org.learning.java8.OOP._2013_._6_Patterns;

class ColorX {
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
}

class ColoredRect {
    private int w;
    private int h;
    private int color;

    ColoredRect(int w, int h, int color) {
        this.w = w;
        this.h = h;
        this.color = color;
    }
}

public class Multiton {
    public static void main(String[] args) throws Exception {
        new ColoredRect(10, 20, ColorX.RED);
        new ColoredRect(10, ColorX.BLUE, 234);
        new ColoredRect(10, 20, ColorX.GREEN);
    }
}