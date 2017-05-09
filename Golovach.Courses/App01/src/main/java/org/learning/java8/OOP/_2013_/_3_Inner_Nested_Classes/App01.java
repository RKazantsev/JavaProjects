package org.learning.java8.OOP._2013_._3_Inner_Nested_Classes;

public class App01 {
    private int k = 0;
    private int n = k;

    public void f() {
        k = 3;
    }

    static public class Nested {
        public static void main(String[] args) {
            System.out.println(new App01().k); // k - доступно, ломает инкапсуляцию
        }
    }
}

class Test {
    public static void main(String[] args) {
        // System.out.println(new App01().k); // k - недоступно
    }
}
