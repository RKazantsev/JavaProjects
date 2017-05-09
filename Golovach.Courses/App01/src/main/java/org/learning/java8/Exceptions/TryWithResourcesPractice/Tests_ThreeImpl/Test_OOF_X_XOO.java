package org.learning.java8.Exceptions.TryWithResourcesPractice.Tests_ThreeImpl;

import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.AutoCloseableFactory;
import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.ThreeImpl;
import org.learning.java8.Exceptions.TryWithResourcesPractice.Labs.TryBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_OOF_X_XOO {
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
        final AutoCloseable resourceC = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                history.add("resourceC.close()");
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
        AutoCloseableFactory factoryC = new AutoCloseableFactory() {
            @Override
            public AutoCloseable create() throws Throwable {
                throw new Error("createC");
            }
        };
        TryBody body = new TryBody() {
            @Override
            public void runBody() throws Throwable {
                history.add("body.runBody()");
            }
        };
        try {
            ThreeImpl.call(factoryA, factoryB, factoryC, body);
        } catch (Error e) {
            if (!"createC".equals(e.getMessage())) {
                throw new AssertionError();
            }
            if (e.getSuppressed().length != 0) {
                throw new AssertionError();
            }
        }
        if (!history.equals(Arrays.asList(
                "factoryA.create()", "factoryB.create()",
                "resourceB.close()", "resourceA.close()"))) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }
}
