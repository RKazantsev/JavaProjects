package org.learning.java8.Exceptions.TryWithResourcesPractice;

import com.sun.org.apache.bcel.internal.generic.FADD;

import java.util.Arrays;

public class AppException_16 {

    public static void main(String[] args) {

//        try (Ok x = new Ok("x");
//             Ok y = new Ok("y");
//             Ok z = new Ok("z")) {
//
//            throw new Error();
//        }

//        try (Ok x = new Ok("x");
//             FailCreate y = new FailCreate("y")) {
//            System.err.println("body");
//
//        }

//        try (FailClose x = new FailClose("x");
//             FailClose y = new FailClose("y")) {
//           throw new Error("body");
//
//        }

//   Suppressed exceptions
        try {
            Error ex = new Error("A");
//        Error exNull = null;
//        ex.addSuppressed(exNull);
            ex.addSuppressed(new Error("B"));
            ex.addSuppressed(new Error("C"));
            throw ex;
        } catch (Error e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("e.getSuppressed() = " + e.getSuppressed()[0].getMessage());
            System.out.println("e.getSuppressed() = " + e.getSuppressed()[1].getMessage());
            System.out.println("e.getCause() = " + e.getCause());

        }
    }
}
