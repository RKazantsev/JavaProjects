package org.learning.java8.OOP._2013_._4_Anonymous;

public class App02 {
    static int k;
    // 2 типа СТАТИЧЕСКОГО КОНТЕКСТА, где создается АНОНИМНЫЙ STATIC NESTED CLASS
    // 1. СТАТИЧЕСКАЯ СЕКЦИЯ ИНИЦИАЛИЗАЦИИ, вызывается ПРИ ЗАГРУЗКЕ КЛАССА!!!
    static {
        Runnable ref = new Runnable() {
            @Override
            public void run() {
                System.out.println(k);
            }
        };
    }
    // 2. STATIC метод
    public static void f() {
         Runnable ref = new Runnable() {
            @Override
            public void run() {
                System.out.println(k);
            }
        };
    }
}

