package org.learning.java8.IO;

import java.io.*;

public class App11_1 {
    public static void main(String[] args) throws FileNotFoundException {

        // File System
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("a.txt");

        // byte[]
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] {1, 2, 3});
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
    }
}
