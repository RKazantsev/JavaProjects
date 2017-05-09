package org.learning.java8.OOP._2013_._3_Inner_Nested_Classes;

public class App02 {
    private int k = f();
    private int f(){
        return k++;
    }

    public App02() {
        System.out.println("Hello!");
    }

    static public class Nested { // Static nested class
    }
}

class TestClass {
    public static void main(String[] args) {
        App02 ref0 = new App02();
        App02.Nested ref1 = new App02.Nested(); //объект класса App02 не создается, это просто часть имени
    }
}
