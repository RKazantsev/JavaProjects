package org.learning.java8.Collections;

import java.util.*;

import static java.util.Arrays.asList;

public class App20 {
    public static void main(String[] args) throws RuntimeException {

        List<String> list = new ArrayList<>(asList("A", "BB", "A"));

        System.out.println(list);
        System.out.println(list.remove(0));

        ArrayList<String> sortedList = new ArrayList<>(new HashSet<>(list));
        Collections.sort(sortedList);
        System.out.println(sortedList);

        f("qwe",1);
        f("dfg", 1, 4, 2);
        f("asd", 1, 8, 66, 777);
        g(1, 3, 4, 5);
        g(5, 1, 4, 2);
        g(6, 1, 8, 66, 777);

    }

    public static void f(String str, int...arr) {
        int[] arr2 = arr;
        System.out.println(str);
    }

    public static void g(int fst, int snd, int...others) {
        System.out.println(Arrays.toString(others));

    }
}
