package org.learning.java8.OOP._2014_.App01.Paint;

public class App03_2 {
    public static void main(String[] args) {
//        List<Figure> figures = new ArrayList<>();
//        figures.add(new Ellipse(10, 20, 100));
//        figures.add(new Ellipse(100, 200, 10));
//        figures.add(new Rectangle(10, 20, 30, 40));
//
//        System.out.println(new Sizer().left(figures));

        Y refY = new Y();
        X refX = refY;

        refY.field = 1;
        refX.field = 2;

        System.out.println(refY.field);
        System.out.println(refX.field);
        System.out.println(refY);
    }
}

class X {
//    public static void f() {
//        System.out.println("X.f");
//    }

    int field;
}

class Y extends X {
//    public static void f() {
//        System.out.println("Y.f");
//    }
    int field;
}

class Z extends Y {
}