package org.learning.java8.OOP._2014_.App01.App02;

public class A {}

class B extends A {}

class C extends B {}

class Demo {
    public static void main(String[] args) {
        A ref = new C();

    }
}

class Parent1 {

}

class Child1 extends Parent1 {
    private void f() {}
    private void g() {f();}
}
