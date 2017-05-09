package org.learning.java8.Exceptions;

/*Try-With-Resources, Multi-Catching, More Precise Rethrow*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

public class AppExceptions_15 {

    public static void main(String[] args) throws IOException/*, SQLException*/ {
//        Try-With-Resources Java 7
        try (FileInputStream in = new FileInputStream("d:/tmp-1.txt");
             FileOutputStream out = new FileOutputStream("d:/tmp-2.txt")) {
            out.write(in.read());
            out.flush();
        }

//        Try-With-Resources old-type

//        FileInputStream in = null;
//        FileOutputStream out = null;
//
//        try {
//            in = new FileInputStream("d:/tmp-1.txt");
//            out = new FileOutputStream("d:/tmp-2.txt");
//            out.write(in.read());
//            out.flush();
//        } finally {
//            try {
//                if (out != null) {
//                    out.close();
//                }
//            } finally {
//                if (in != null) {
//                    in.close();
//                }
//            }
//        }

//        ABC cl = new ABC();
//
//        System.out.println(cl.getInteger());
//        System.out.println(cl.getBool());
//        System.out.println(cl.getBoolean());

//--------------------------------------------------------
//  More Precise Rethrowing, Multi-Catching
//        try {
//            if (System.nanoTime() % 2 == 0) {
//                throw new IOException();
//            } else {
//                throw new SQLException();
//            }
//        } catch (IOException | SQLException e) {
//            SQLException ee = (SQLException) e;
//            if (e instanceof SQLException) {}
//            Exception x = e;
//            throw e;
//        } catch (NullPointerException e) {
//            throw e;
//        } catch (StackOverflowError e) {
//            throw e;
//        }

//        Compilator - left, JVM  - right
//        try {
//            Throwable t = new RuntimeException();
//            throw t;
//        } catch (Exception e) {
//
//        }

//        Compilator - left, JVM  - right
//        Object ref = new int[] {0, 1, 2};
//        int k = ref[0];

//  StackOverflowError
//        main(args);

//  NullPointerException
//        Object ref = null;
//        ref.toString();

//  OutOfMemoryError
//        long[] array = new long[Integer.MAX_VALUE];
    }
}

//class ABC {
//    int x;
//    boolean y;
//    Boolean z;
//
//    int getInteger() {
//        return x;
//    }
//
//    boolean getBool() {
//        return y;
//    }
//
//    Boolean getBoolean() {
//        return z;
//    }
//}
