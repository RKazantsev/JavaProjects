package org.learning.java8.Collections.App16;

import java.util.ArrayList;
import java.util.List;

public class App16_4_EqualsInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.add(new Integer(2));

        System.out.println("list: " + list);
        System.out.println("contains: " + list.contains(new Integer(1)));
        System.out.println("remove: " + list.remove(new Integer(1)));
        System.out.println("list: " + list);
    }
}
