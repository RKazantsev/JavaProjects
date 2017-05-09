package org.learning.java8.OOP._2014_.App01.App23;


public class App23_2 {

    private int k = 0;
    private int p = k;

    public void f() {
        k = 0;
    }

    static public class Nested {
        public static void main(String[] args) {
            System.out.println(new App23_2().k); // k видно, нарушение инкапсуляции, класс friend в C++
        }
    }
}

class Test {
    public static void main(String[] args) {
//        new Nested();
        //System.out.println(new App23_2().k); // k не видно
    }
}
