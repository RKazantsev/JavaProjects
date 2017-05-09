package org.learning.java8.IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class App11_3 {
    public static void main(String[] args) throws IOException {
        InputStream src = new URL("https://www.rbc.ua").openStream();

        // Write into file
//        OutputStream dst = new FileOutputStream("d:/tmp/rbc.txt");
//        copy(src, dst);

        //Output on console
        copy(src, System.out);
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        byte[] buff = new byte[1024 * 64];

        while (true) {
            int count = src.read(buff); // read(byte[]) возвращает КОЛИЧЕСТВО СЧИТАННЫХ ДАННЫХ!!!
            if (count != -1) {
                dst.write(buff, 0, count);
            } else {
                return;
            }
        }
    }
}
