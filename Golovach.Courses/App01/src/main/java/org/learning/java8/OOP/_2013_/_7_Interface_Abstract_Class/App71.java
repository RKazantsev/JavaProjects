package org.learning.java8.OOP._2013_._7_Interface_Abstract_Class;


import java.util.ArrayList;
import java.util.List;

public class App71 {
    public static void main(String[] args) {
        f(1);
        g(new ArrayList<>());

        List<Integer> ref0 = null;
        List<String> ref1 = null;
        // ref0 = ref1; // разные типы


    }

    public static void f(double k) {
        System.out.println("Double: " + k);
    }

    public static void f(long k) {
        System.out.println("Long: " + k);
    }

// После компиляции дженерики стираются, остается только List<>, это метод type erasure (стирание типов)
/*    public static void g(List<Integer> k) {
        System.out.println("List: " + k);
    }*/
    public static void g(List<String> k) {
        System.out.println("List: " + k);
    }



    public static void g(Object k) {
        System.out.println("Object: " + k);
    }
}
