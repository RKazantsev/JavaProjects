package org.learning.java8.Exceptions.TryWithResourcesPractice;

public class FailCreate implements AutoCloseable {

    private String msg;

    public FailCreate(String msg) {
        this.msg = msg;
        System.err.println("new: " + msg);
        throw new Error(msg);
    }

    public void close() {
        System.err.println("close: " + msg);
    }
}
