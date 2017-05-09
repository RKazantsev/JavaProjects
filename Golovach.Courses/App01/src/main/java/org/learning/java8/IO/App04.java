package org.learning.java8.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App04 {
    public static void main(String[] args) throws FileNotFoundException {

//        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("Bad ..." + e.getClass());
//                StackTraceElement[] stack = e.getStackTrace();
//                System.out.println(stack[0].getFileName());
//            }
//        });


        new FileInputStream("    sdfwerwerty fghfgh");
    }
}
