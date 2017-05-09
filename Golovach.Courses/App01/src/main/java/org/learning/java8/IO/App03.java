package org.learning.java8.IO;

import java.util.Arrays;

public class App03 {
    public static void main(String[] args) throws Exception {

        System.out.println("ЭЮЯ".getBytes("UTF-8").length);
        System.out.println("ЭЮЯ".getBytes("cp1251").length);
        System.out.println(Arrays.toString("ЭЮЯ".getBytes("UTF-8")));
        System.out.println(Arrays.toString("ЭЮЯ".getBytes("cp1251")));
        System.out.println("hello".toCharArray());

        System.out.println("-----------------------------------------------------");
        char ch;
        ch= 0x0001;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
        ch= 0x0111;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
        ch= 0x1111;
        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));

        System.out.println("-----------------------------------------------------");
        char ch0 = 55378;
        char ch1 = 56816;
        String str = new String(new char[] {ch0, ch1});
        System.out.println("str: " + str);
        System.out.println("str.length() : " + str.length());
        System.out.println(str.codePointCount(0, 2));
        System.out.println(str.codePointAt(0));
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println((char) 411);

    }
}
