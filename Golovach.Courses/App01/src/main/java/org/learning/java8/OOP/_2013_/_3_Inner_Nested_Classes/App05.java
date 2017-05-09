package org.learning.java8.OOP._2013_._3_Inner_Nested_Classes;

public class App05 {
    public int k;

    public App05(int k) {
        this.k = k;
    }

    public class Inner {
        public void f() {
            System.out.println(k++);
        }
    }
}

class Test05 {
    public static void main(String[] args) {

        App05 ref = new App05(100);
        App05.Inner inner0 = ref.new Inner();
        App05.Inner inner1 = ref.new Inner();
        inner0.f();
        inner1.f();
        inner0.f();
        inner1.f();

    }
}