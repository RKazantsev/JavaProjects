package org.learning.java8.OOP._2014_.App01.Paint;

import java.util.List;

public class Painter2 {
    public void draw(List<Figure> figures) {
        for (Figure fig: figures) {
            fig.draw();
        }
    }
}
