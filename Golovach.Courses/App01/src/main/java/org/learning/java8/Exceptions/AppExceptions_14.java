package org.learning.java8.Exceptions;

import java.io.IOError;
import java.io.IOException;
import java.sql.SQLException;

public class AppExceptions_14 {
    public static void main(String[] args) throws Throwable {
        try {
            try {
                a();
            } finally {
            }
            throw new IOException();
        }
        catch (Error e) {
            throw new Throwable();
        }
    }

    public static void a() throws NullPointerException, SQLException {

    }
}
