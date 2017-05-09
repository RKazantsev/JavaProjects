package org.learning.java8.OOP._2014_.App01.Paint;

import java.util.ArrayList;
import java.util.List;

public class App03_1 {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Ellipse(10, 20, 100));
        figures.add(new Ellipse(100, 200, 10));
        figures.add(new Rectangle(10, 20, 30, 40));

        new Painter().draw(figures);
        System.out.println(new Sizer().left(figures));

    }
}
