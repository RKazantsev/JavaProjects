package org.learning.java8.Exceptions.TryWithResourcesPractice.Tests;

import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.AutoCloseableFactory;
import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.TryBody;
import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.TwoImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_OO_F_OF {
    public static void main(String[] args) throws Throwable {

        final List<String> history = new ArrayList<>();

        final AutoCloseable resourceA = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                history.add("resourceA.close()");
                throw new Error("closeA");
            }
        };
        final AutoCloseable resourceB = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                history.add("resourceB.close()");
            }
        };
        AutoCloseableFactory factoryA = new AutoCloseableFactory() {
            @Override
            public AutoCloseable create() throws Throwable {
                history.add("factoryA.create()");
                return resourceA;
            }
        };
        AutoCloseableFactory factoryB = new AutoCloseableFactory() {
            @Override
            public AutoCloseable create() throws Throwable {
                history.add("factoryB.create()");
                return resourceB;
            }
        };
        TryBody body = new TryBody() {
            @Override
            public void runBody() throws Throwable {
                history.add("body.runBody()");
                throw new Error("body");
            }
        };
        try {
            TwoImpl.call(factoryA, factoryB, body);
        } catch (Error e) {
            if (!"body".equals(e.getMessage())) {
                throw new AssertionError();
            }
            if (e.getSuppressed().length != 1) {
                throw new AssertionError();
            }
            if (!"closeA".equals(e.getSuppressed()[0].getMessage())) {
                throw new AssertionError();
            }
        }

        if (!history.equals(Arrays.asList(
                "factoryA.create()", "factoryB.create()",
                "body.runBody()",
                "resourceB.close()", "resourceA.close()"))) {
            throw new AssertionError();
        }

        System.out.println("OK");
    }
}
