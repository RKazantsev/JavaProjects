package org.learning.java8.IO;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Arrays;


// Implementing own Decorator pattern class

public class App12_1 {
    public static void main(String[] args) throws IOException {
        OutputStream dst = new ByteArrayOutputStream();
        dst = new LogOS(dst, "AFTER");
        dst = new BufferedOutputStream(dst, 2);
        dst = new LogOS(dst, "BEFORE");
        //dst = new GZIPOutputStream(dst);
        dst.write(1);
        dst.write(2);
        dst.write(3);
        dst.write(4);
        dst.write(5);
        dst.flush();
    }
}

class LogOS extends OutputStream {

    private final OutputStream impl;
    private final String name;


    LogOS(OutputStream impl, String name) {
        this.impl = impl;
        this.name = name;
    }

    @Override
    public void write(int b) throws IOException {
        System.out.println(name + ":write(" + b + ")");
        impl.write(b);
    }

    @Override
    public void write(@NotNull byte[] b) throws IOException {
        System.out.println(name + ":write(" + Arrays.toString(b) + ")");
        impl.write(b);
    }

    @Override
    public void write(@NotNull byte[] b, int off, int len) throws IOException {
        System.out.println(name + ":write(" + Arrays.toString(b) + ", " + off + ", " + len );
        impl.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        System.out.println(name + " flush");
        impl.flush();
    }

    @Override
    public void close() throws IOException {
        impl.close();
    }
}
