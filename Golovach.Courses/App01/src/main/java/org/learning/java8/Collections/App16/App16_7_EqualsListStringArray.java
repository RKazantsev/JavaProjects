package org.learning.java8.Collections.App16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App16_7_EqualsListStringArray {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<String[]>() {
            @Override
            public String toString() {
                String str = "[";
                for (int i = 0; i < this.size(); i++) {
                    str += "{";
                    for (int j = 0; j < this.get(i).length; j++) {
                        str += this.get(i)[j];
                        if (j != this.get(i).length - 1) {
                            str += ", ";
                        }
                    }
                    str += "}";
                    if (i != this.size() - 1) {
                        str += "; ";
                    }
                }
                return str + "]";
            }
        };
        list.add(new String[]{"A", "B", "C"});
        list.add(new String[]{"D", "E", "F"});
        list.add(new String[]{"G", "H", "I"});

        System.out.println("list: " + list.toString());
        System.out.println("contains: " + list.contains(new String[]{"D", "E", "F"}));
        System.out.println("remove: " + list.remove(new String[]{"D", "E", "F"}));
        System.out.println("list: " + list);
    }
}
