package org.learning.java8.Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class AppExceptions_13 {
    public static void main(String[] args) throws Throwable {
            close();
    }

    public static void close() throws Exception {

//        System.out.println(System.currentTimeMillis());
//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date(0));
//        System.out.println(new Date(System.currentTimeMillis()));
//        System.out.println(new Date(System.currentTimeMillis() - 24 * 3600 * 1000));

//          System.out.println(System.nanoTime());
//          System.out.println(System.nanoTime());

        if (System.nanoTime() % 2 == 0) {
            throw new IOException();
        } else {
            throw new SQLException();
        }
    }
}
