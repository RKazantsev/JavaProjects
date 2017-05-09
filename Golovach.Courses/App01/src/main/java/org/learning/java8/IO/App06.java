package org.learning.java8.IO;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class App06 {
    public static void main(String[] args) {

//      Список доступных CharSet и их общее количество.

        Map<String, Charset> allCharsets = Charset.availableCharsets();
        Set<String> charsetNames = allCharsets.keySet();
        System.out.println(charsetNames);
        System.out.println(charsetNames.size());
    }
}
