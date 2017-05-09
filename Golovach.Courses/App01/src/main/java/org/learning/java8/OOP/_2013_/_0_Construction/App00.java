package org.learning.java8.OOP._2013_._0_Construction;

class A {
    A() {   System.out.println("A");    }
    void f(){   System.out.println("A.f");  }
}

class B extends A {
    B() {   System.out.println("B");   }
    void f(){   System.out.println("B.f");  } // overriding = переопределение
}

class C extends B {
    C() {   System.out.println("C");    }
    void f(){   System.out.println("C.f");  } // overriding = переопределение
}

public class App00 {
    public static void main(String[] args) {
        B ref0 = new C();
        A ref1 = ref0;
        ref1.f();

    }
}
