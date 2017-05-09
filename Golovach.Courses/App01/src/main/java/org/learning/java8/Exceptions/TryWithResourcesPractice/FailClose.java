package org.learning.java8.Exceptions.TryWithResourcesPractice;

public class FailClose implements AutoCloseable {

    private String msg;

    public FailClose(String msg) {
        this.msg = msg;
        System.err.println("new: " + msg);
    }

    public void close() {
        System.err.println("close: " + msg);
        throw new Error(msg);
    }
}
