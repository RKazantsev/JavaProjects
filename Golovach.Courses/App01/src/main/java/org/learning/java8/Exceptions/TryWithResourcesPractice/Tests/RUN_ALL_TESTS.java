package org.learning.java8.Exceptions.TryWithResourcesPractice.Tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class RUN_ALL_TESTS {

    public static final String[] TESTS = {
            "Test_OO_F_FF",
            "Test_OO_F_FO",
            "Test_OO_O_OO",
            "Test_OO_F_OF",
            "Test_OO_O_OF",
            "Test_OO_O_FO",
            "Test_OO_O_FF",
            "Test_OO_F_OO",
            "Test_OF_X_XO",
            "Test_OF_X_XF",
            "Test_FX_X_XX"
    };

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        for (String test : TESTS) {
            Class testClass = Class.forName(new Exception().getStackTrace()[0].getClassName().replace("RUN_ALL_TESTS", "") + test);
            Method mainMethod = testClass.getDeclaredMethod("main", new Class[]{String[].class});
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            try {
                mainMethod.invoke(null, (Object) null);
            } catch (Throwable t) {
                System.err.println("- TEST FAILED (exception): " + test);
                continue;
            }
//            if (!Arrays.equals("OK".getBytes(StandardCharsets.US_ASCII), out.toByteArray())) {
//                System.err.println("- TEST FAILED (not 'OK' in System.out): " + test);
//                continue;
//            }
            System.err.println("TEST OK: " + test);
        }
    }
}
