package org.learning.java8.OOP._2013_._2_Polymorphism.Painter;

import java.util.List;

class Sizer {

    static void getPictureBorders(List<Figure> list) {
        System.out.println("Left Border : " + getLeftPictureBorder(list));
        System.out.println("Right Border : " + getRightPictureBorder(list));
        System.out.println("Top Border : " + getTopPictureBorder(list));
        System.out.println("Bottom Border : " + getBottomPictureBorder(list));
    }

    static int getLeftPictureBorder(List<Figure> figureList) {
        if (figureList.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int leftPoint = Integer.MAX_VALUE;
        for (Figure fig: figureList) {
            leftPoint = Math.min(leftPoint, fig.left());
        }
        return leftPoint;
    }

    static int getRightPictureBorder(List<Figure> figureList) {
        if (figureList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int rightPoint = Integer.MIN_VALUE;
        for (Figure fig: figureList) {
            rightPoint = Math.max(rightPoint, fig.right());
        }
        return rightPoint;
    }

    static int getTopPictureBorder(List<Figure> figureList) {
        if (figureList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int topPoint = Integer.MAX_VALUE;
        for (Figure fig: figureList) {
            topPoint = Math.min(topPoint, fig.top());
        }
        return topPoint;
    }

    static int getBottomPictureBorder(List<Figure> figureList) {
        if (figureList.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int bottomPoint = Integer.MIN_VALUE;
        for (Figure fig: figureList) {
            bottomPoint = Math.max(bottomPoint, fig.bottom());
        }
        return bottomPoint;
    }
}
