package org.learning.java8.OOP._2013_._4_Anonymous;

public class App01 {
    int k;
    // 3 типа НЕСТАТИЧЕСКОГО КОНТЕКСТА, где создается АНОНИМНЫЙ INNER CLASS
    // 1. Секция инициализации, вызывается перед КОНСТРУКТОРОМ
    {
        Runnable ref = () -> {
                App01 outer = App01.this;
                System.out.println(k);
        };
    }
    // 2. КОНСТРУКТОР, не может быть STATIC по определению
    public App01() {
        Runnable ref = () -> {
                App01 outer = App01.this;
                System.out.println(k);
        };
    }

    // 3. НЕ STATIC метод
    public  void f() {
         Runnable ref = () -> {
             App01 outer = App01.this;
             System.out.println(k);
         };
    }
}

class X {
    public static void main(String[] args) {
        new App01().f();
    }
}