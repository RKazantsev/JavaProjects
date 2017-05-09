package org.learning.java8.Exceptions.TryWithResourcesPractice.Labs;

public interface AutoCloseableFactory {

    AutoCloseable create() throws Throwable;
}
