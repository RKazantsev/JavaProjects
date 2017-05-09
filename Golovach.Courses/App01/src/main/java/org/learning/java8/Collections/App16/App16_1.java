package org.learning.java8.Collections.App16;

public class App16_1 {
    public static void main(String[] args) {

        System.out.println(new B() instanceof B);
        System.out.println(new B() instanceof A);
        System.out.println((Class)new B().getClass() == B.class);
        System.out.println((Class)new B().getClass() == A.class);
    }

}

class A {}
class B extends A {
    int x = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof B)) return false;

        B b = (B) o;

        return x == b.x;
    }

    @Override
    public int hashCode() {
        return x;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        B b = (B) o;

        return x == b.x;
    }

    @Override
    public int hashCode() {
        return x;
    }*/
}
