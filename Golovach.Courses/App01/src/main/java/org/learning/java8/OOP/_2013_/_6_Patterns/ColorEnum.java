package org.learning.java8.OOP._2013_._6_Patterns;

public enum ColorEnum {
    RED, GREEN, BLUE
}

// Верхний enum сокращенная форма следующего класса:
/*class ColorEnum {
    public static final ColorEnum RED = new ColorEnum();
    public static final ColorEnum GREEN = new ColorEnum();
    public static final ColorEnum BLUE = new ColorEnum();

    private ColorEnum() {}
}*/

class ColoredRectX {
    private int w;
    private int h;
    private ColorEnum colorEnum;

    ColoredRectX(int w, int h, ColorEnum colorEnum) {
        this.w = w;
        this.h = h;
        this.colorEnum = colorEnum;
    }
}

class ColorMain {
    public static void main(String[] args) throws Exception {
        new ColoredRectX(10, 20, ColorEnum.RED);
        new ColoredRectX(20, 30, ColorEnum.BLUE);
        new ColoredRectX(30, 40, ColorEnum.GREEN);
    }
}
