package org.learning.java8.Collections;

import java.util.*;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

public class App21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(asList("A", "BB", "CCC"));


        if (list instanceof RandomAccess) {
            for (int k = 0; k < list.size(); k++) {
                System.out.println(list.get(k));
            }
        }

//        Iterator<String> iter = list.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }

        Set<Integer> set = new HashSet<>(asList(1, 2, 3));
        for (Integer aSet : set) {
            System.out.println(aSet);
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("A", "*");
        map.put("B", "+");
        map.put("C", "-");
        for (Map.Entry<String, String> elem : map.entrySet()) {
            System.out.println(elem);
        }

        for (int elem: new int[] {1, 2, 3, 4, 5}) {
            System.out.println(elem);
        }

        for (Student elem: new Group()
             ) {

        }
    }
}

class Student {}

class Group implements Iterable<Student> {

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {

    }

    @Override
    public Spliterator<Student> spliterator() {
        return null;
    }
}