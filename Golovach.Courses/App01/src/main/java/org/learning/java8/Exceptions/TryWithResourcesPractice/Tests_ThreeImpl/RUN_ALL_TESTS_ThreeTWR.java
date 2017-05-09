package org.learning.java8.Exceptions.TryWithResourcesPractice.Tests_ThreeImpl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public class RUN_ALL_TESTS_ThreeTWR {
    public static final String[] TESTS = {
            "Test_FXX_X_XXX",
            "Test_OFX_X_XXF",
            "Test_OFX_X_XXO",
            "Test_OOF_X_XFF",
            "Test_OOF_X_XFO",
            "Test_OOF_X_XOF",
            "Test_OOF_X_XOO",
            "Test_OOO_F_FFF",
            "Test_OOO_F_FFO",
            "Test_OOO_F_FOF",
            "Test_OOO_F_FOO",
            "Test_OOO_F_OFF",
            "Test_OOO_F_OFO",
            "Test_OOO_F_OOF",
            "Test_OOO_F_OOO",
            "Test_OOO_O_FFF",
            "Test_OOO_O_FFO",
            "Test_OOO_O_FOF",
            "Test_OOO_O_FOO",
            "Test_OOO_O_OFF",
            "Test_OOO_O_OFO",
            "Test_OOO_O_OOF",
            "Test_OOO_O_OOO",
    };

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        for (String test : TESTS) {
            Class testClass = Class.forName(new Exception().getStackTrace()[0].getClassName().replace("RUN_ALL_TESTS_ThreeTWR", "") + test);
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
