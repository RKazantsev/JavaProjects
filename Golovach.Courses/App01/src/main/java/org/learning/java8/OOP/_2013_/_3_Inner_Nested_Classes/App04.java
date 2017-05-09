package org.learning.java8.OOP._2013_._3_Inner_Nested_Classes;

public class App04 {
    public class Inner {}
}

class Test04 {
    public static void main(String[] args) {
        App04 base0 = new App04();              // на каждый outer класс ссылается по 3 inner класса
        App04.Inner in0 = base0.new Inner();
        App04.Inner in1 = base0.new Inner();
        App04.Inner in2 = base0.new Inner();

        App04 base1 = new App04();
        App04.Inner in10 = base1.new Inner();
        App04.Inner in20 = base1.new Inner();
        App04.Inner in30 = base1.new Inner();
    }
}


