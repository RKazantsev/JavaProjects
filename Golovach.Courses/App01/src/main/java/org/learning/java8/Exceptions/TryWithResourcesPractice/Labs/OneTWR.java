package org.learning.java8.Exceptions.TryWithResourcesPractice.Labs;

public class OneTWR {
    public static void call(AutoCloseableFactory factory, TryBody body) throws Throwable {
        try (AutoCloseable resource = factory.create()) {
            body.runBody();
        }


    }
}
