package org.learning.java8.OOP._2013_._4_Anonymous;


public class App03 {
    int k = 0; // ПОЛЕ КЛАССА, ХРАНИТСЯ В HEAP

    public void f() {

        final int[] p = {0}; // ЛОКАЛЬНАЯ ПЕРЕМЕННАЯ, ХРАНИТСЯ В STACK, если используется в анонимном классе должна быть FINAL
        System.out.println(p[0]);

        Runnable ref = new Runnable() {
            @Override
            public void run() {
                k = 1;
                System.out.println(k);
                p[0] = 1;
                System.out.println(p[0]);
            }
        };
    }
}
