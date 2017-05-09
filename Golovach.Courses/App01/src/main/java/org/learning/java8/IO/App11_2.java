package org.learning.java8.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class App11_2 {
    public static void main(String[] args) throws IOException {
        InputStream src = new URL("https://www.rbc.ua").openStream();

        // Write into file
//        OutputStream dst = new FileOutputStream("d:/tmp/rbc.txt");
//        copy(src, dst);

        //Output on console
        copy(src, System.out);
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int data = src.read(); // read() без аргументов возвращает ДАННЫЕ!!!
            if (data != -1) {
                dst.write(data);
            } else {
                return;
            }
        }
    }
}
