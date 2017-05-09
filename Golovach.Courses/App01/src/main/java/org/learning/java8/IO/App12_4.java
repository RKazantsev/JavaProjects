package org.learning.java8.IO;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class App12_4 {
    public static void main(String[] args) throws IOException {
        OutputStream buff = new FileOutputStream("d:/tmp/output.txt");
        OutputStream dst = new BufferedOutputStream(buff, 64 * 1024);
        dst = new GZIPOutputStream(dst);
        DataOutputStream out = new DataOutputStream(dst);

        long start = System.currentTimeMillis();
        for (int k = 0; k < 1_000_000; k++) {
            out.writeDouble(k % 2 == 0 ? 0.5 : 1.5);
        }
        dst.flush();
        dst.close();

        long stop = System.currentTimeMillis();

        System.out.println(stop - start);

    }
}
