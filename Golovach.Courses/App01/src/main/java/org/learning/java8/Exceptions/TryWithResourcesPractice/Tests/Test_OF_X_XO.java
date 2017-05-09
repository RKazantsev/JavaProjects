package org.learning.java8.Exceptions.TryWithResourcesPractice.Tests;

import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.AutoCloseableFactory;
import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.TryBody;
import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.TwoImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_OF_X_XO {
    public static void main(String[] args) throws Throwable {

        final List<String> history = new ArrayList<>();

        final AutoCloseable resourceA = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                history.add("resourceA.close()");
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
                throw new Error("createB");
            }
        };
        TryBody body = new TryBody() {
            @Override
            public void runBody() throws Throwable {
                history.add("body.runBody()");
            }
        };
        try {
            TwoImpl.call(factoryA, factoryB, body);
        } catch (Error e) {
            if (!"createB".equals(e.getMessage())) {
                throw new AssertionError();
            }
            if (e.getSuppressed().length != 0) {
                throw new AssertionError();
            }
        }

        if (!history.equals(Arrays.asList(
                "factoryA.create()", "factoryB.create()",
                "resourceA.close()"))) {
            throw new AssertionError();
        }

        System.out.println("OK");
    }
}
