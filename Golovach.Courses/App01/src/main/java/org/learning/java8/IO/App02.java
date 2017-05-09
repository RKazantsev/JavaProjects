package org.learning.java8.IO;

import java.util.Arrays;

public class App02 {
    public static void main(String[] args) throws Exception {

        System.out.println(Arrays.toString("A".getBytes()));
        System.out.println(Arrays.toString("A".getBytes("UTF-8")));
        System.out.println(Arrays.toString("A".getBytes("UTF-16")));
        System.out.println(Arrays.toString("A".getBytes("UTF-16BE")));
        System.out.println(Arrays.toString("A".getBytes("UTF-16LE")));
        System.out.println(Arrays.toString("A".getBytes("UTF-32")));
        System.out.println(Arrays.toString("A".getBytes("UTF-32BE")));
        System.out.println(Arrays.toString("A".getBytes("UTF-32LE")));

//        byte[] bytes = "AA".getBytes("UTF-8");
//        System.out.println(Arrays.toString(bytes));
//        String str = new String(bytes, "UTF-8");
//        System.out.println(str);

    }
}
