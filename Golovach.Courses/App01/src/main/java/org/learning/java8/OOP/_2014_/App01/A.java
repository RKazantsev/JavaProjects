package org.learning.java8.OOP._2014_.App01;

class A {
    A() {
        System.out.println("A" + this.hashCode());
    }

    void f() {
        System.out.println("A.f");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
    void f() {
        System.out.println("B.f");
    }
}

class C extends B {
    C() {
        System.out.println("C");
    }
    void f() {
        System.out.println("C.f");
    }
}

class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println("---");
        B ref0 = new C();
        A ref1 = ref0;
        ref1.f();
    }



}


