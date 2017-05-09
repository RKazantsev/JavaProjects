package org.learning.java8.OOP._2013_._1_Type;

class A /*extends Object*/ {}

class B extends A {}

class C extends B {
    void f() {}
}

public class App03 {
    public static void main(String[] args) {
//        A ref = new C();
//        ref.f();
        print("Hello!");
        print(new C());
        print(new int[]{1, 2, 3});
    }
    public static void print(Object o) {
        System.out.println("o : " + o.toString());
    }
}
