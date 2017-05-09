package org.learning.java8.OOP._2014_.App01;

class X {
    private X(int k) {
        System.out.println("X(int)");
    }
    X(String s) {
        this(0);
        System.out.println("X(String)");
    }
}

class Y extends X {

    public Y() {
        super("");
        System.out.println("Y()");
    }

    public Y(int x, int y) {
        this();
        System.out.println("Y(int, int)");
    }
}

class Test2 {
    public static void main(String[] args) {
        new Y(0, 0);
        int n = 64;
        n <<= 8;
        System.out.println(n);
    }

}