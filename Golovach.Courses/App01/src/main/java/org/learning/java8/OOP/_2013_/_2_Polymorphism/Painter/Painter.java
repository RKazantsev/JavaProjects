package org.learning.java8.OOP._2013_._2_Polymorphism.Painter;

import java.util.List;

class Painter {
    static void draw(List<Figure> list) {
        for (Figure fig: list) {
            fig.draw();
        }
    }
}
