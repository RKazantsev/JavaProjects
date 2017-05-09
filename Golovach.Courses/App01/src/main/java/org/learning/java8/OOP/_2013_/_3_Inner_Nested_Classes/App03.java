package org.learning.java8.OOP._2013_._3_Inner_Nested_Classes;

public class App03 {
    public class Inner { // Inner class, without static
    }
}

class Test03 {
    public static void main(String[] args) {
        App03 ref0 = new App03();
        //App03.Inner ref1 = new App03.Inner(); // error
        App03.Inner ref1 = ref0.new Inner(); // inner классу нужен всегда объект outer класса!!!
        App03.Inner ref2 = ref0.new Inner(); //
        App03.Inner ref3 = ref0.new Inner(); //
        App03.Inner ref4 = new App03().new Inner(); // можно так
    }
}


