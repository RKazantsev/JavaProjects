package org.learning.java8.OOP._2013_._0_Construction;


class A1 {
    int x = 10;
    A1() {
        this("A");
        System.out.println("A empty");
    }

    A1(String str) {
        System.out.println("A str " + str);
    }
}

class B1 extends A1 {
    B1() {
        this("B");
        System.out.println("B empty " + this.x + super.x);
    }
    B1(String str) {
        System.out.println("B str " + str);
    }
}

public class App01 {
    public static void main(String[] args) {
        A1 ref = new B1();
        A1 ref4 = new A1();
        System.out.println(ref.x);
        System.out.println(ref4.x);
    }

}
