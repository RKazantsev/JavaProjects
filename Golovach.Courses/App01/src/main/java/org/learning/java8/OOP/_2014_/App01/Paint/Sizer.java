package org.learning.java8.OOP._2014_.App01.Paint;

import java.util.List;

public class Sizer {

    public int left(List<Figure> figures) {
        if (figures.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int min = figures.get(0).left();
        for (int k = 1; k < figures.size(); k++) {
            min = Math.min(min, figures.get(k).left());
        }
        return min;
    }
}
