package org.learning.java8.Collections.App16;

import java.util.ArrayList;
import java.util.List;

public class App16_5_EqualsUser0 {
    public static void main(String[] args) {
        List<User0> list = new ArrayList<>();
        list.add(new User0("Anna", 18));
        list.add(new User0("Mike", 45));
        list.add(new User0("Sara", 25));


        System.out.println("list: " + list);
        System.out.println("contains: " + list.contains(new User0("Mike", 45)));
        System.out.println("remove: " + list.remove(new User0("Mike", 45)));
        System.out.println("list: " + list);
    }
}
