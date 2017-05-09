package org.learning.java8.Exceptions.TryWithResourcesPractice;

public class Ok implements AutoCloseable {

    private String msg;

    public Ok(String msg) {
        this.msg = msg;
        System.err.println("new: " + msg);
    }

    public void close() {
        System.err.println("close: " + msg);
    }
}
