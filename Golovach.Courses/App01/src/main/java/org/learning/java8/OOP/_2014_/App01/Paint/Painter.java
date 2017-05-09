package org.learning.java8.OOP._2014_.App01.Paint;

import java.util.List;

public class Painter {
    public void draw(List<Figure> figures) {
        for (Object fig: figures) {
            if (fig instanceof Ellipse) {
                Ellipse el = (Ellipse) fig;
                System.out.println(("Ellipse: " + el.radius));
            } else if (fig instanceof Rectangle) {
                Rectangle rect = (Rectangle) fig;
                System.out.println(("Rectangle: " + rect.height));
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
