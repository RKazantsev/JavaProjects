package org.learning.java8.IO;


import java.io.*;

public class App15_1 {
    public static void main(String[] args) throws IOException {
        String str = "Hello!";
        char[] chars = str.toCharArray();
        OutputStream dst = new FileOutputStream("d:/tmp.txt");
        Writer writer = null;
        writer.write(chars);
    }
}
