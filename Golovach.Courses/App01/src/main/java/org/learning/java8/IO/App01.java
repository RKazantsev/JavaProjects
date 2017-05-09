package org.learning.java8.IO;

import java.util.Arrays;

public class App01 {
    public static void main(String[] args) throws Exception {

        String str = new String(new byte[] {0, 1, 2});
        System.out.println(str);
        byte[] raw0 = str.getBytes("UTF-8");
        byte[] raw1 = str.getBytes("ASCII");
        System.out.println(Arrays.toString(raw0));
        System.out.println(Arrays.toString(raw1));

        System.out.println("A".getBytes("UTF-8").length);
        System.out.println("AA".getBytes("UTF-16").length);
        System.out.println("AAA".getBytes("UTF-16").length);


        System.out.println(Arrays.toString("A".getBytes("UTF-8")));
        System.out.println(Arrays.toString("A".getBytes("UTF-16")));



    }
}
