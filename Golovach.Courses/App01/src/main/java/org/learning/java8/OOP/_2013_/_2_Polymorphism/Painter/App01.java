package org.learning.java8.OOP._2013_._2_Polymorphism.Painter;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();
        list.add(new Circle(100, 100, 50));
        list.add(new Rectangle(150, 130, 60, 70));
        list.add(new Circle(200, 100, 120));
        Painter.draw(list);
        Sizer.getPictureBorders(list);
    }
}
