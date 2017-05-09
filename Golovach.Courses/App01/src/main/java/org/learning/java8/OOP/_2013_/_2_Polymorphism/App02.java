package org.learning.java8.OOP._2013_._2_Polymorphism;

public class App02 {
    public static void main(String[] args) {

        /*X ref0 = new Child();
        ref0.f();

        X ref1 = new Child();
        ref1.f();

        X ref2 = new Z();
        ref2.f();*/

        Child refChild = new Child();
        refChild.n = 3;

        Parent refParent = refChild;
        refParent.n = 4;

        System.out.println(refChild.n);
        System.out.println(refParent.n);
    }
}

class Parent {
    int n;
    /*public *//*static*//* void f() {
        System.out.println("X.f()");
    }*/
}

class Child extends Parent {
    int n;
    /*public *//*static*//* void f() {
        System.out.println("Child.f()");
    }*/
}

class Z extends Child {
}
