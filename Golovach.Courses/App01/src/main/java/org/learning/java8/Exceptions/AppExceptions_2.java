package org.learning.java8.Exceptions;

public class AppExceptions_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            f();
            System.err.println();
        }
    }

    private static void f() {
        for (int k = 0; k < 2; k++) {
            System.err.println(0);
//            if (true) continue;
//            if (true) break;
//            if (true) return;
            if (true) throw new Error("ok");
            System.err.print(1);
        }
        System.err.print(2);
    }
}
