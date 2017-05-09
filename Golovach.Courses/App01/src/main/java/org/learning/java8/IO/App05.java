package org.learning.java8.IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class App05 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        byte[] bytes = {70, 71, 72};
        String str = new String(bytes, "UTF-8");
        String str1 = new String(bytes, "cp1251");
        String str2 = new String(bytes, "UTF-16");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        char[] chars = str.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);

        byte[] bytes1 = {-100, -101, -102};
        String str3 = new String(bytes1, "UTF-8");
        String str4 = new String(bytes1, "cp1251");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(Arrays.toString(str3.toCharArray()));
        System.out.println(Arrays.toString(str4.toCharArray()));

    }
}
