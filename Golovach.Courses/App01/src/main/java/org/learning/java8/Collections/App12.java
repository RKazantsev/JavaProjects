package org.learning.java8.Collections;

import java.util.HashMap;
import java.util.Map;

public class App12 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

//        System.out.println(map.size());
//        System.out.println(map.isEmpty());

        System.out.println(map.put("A", 1));
        System.out.println(map.put("A", 2));
        System.out.println(map.put("A", 5));
        System.out.println(map.put("B", 3));
        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        System.out.println(map.remove("A"));
        System.out.println(map);

        Pair<String, Integer> pair = new Pair<>("Mike", 20);
        System.out.println(pair.fst);
        System.out.println(pair.snd);

        Pair<String, Pair<String, Pair<Integer, Integer>>> quadro0 = new Pair<>("Mike", new Pair<>("Ann", new Pair<>(35, 30)));
        System.out.println(quadro0.toString());
        Pair<Pair<Pair<String, String>, Integer>, Integer> quadro1 = new Pair<>(new Pair<>(new Pair<>("Mike", "Ann"), 35), 30);
        System.out.println(quadro1.toString());
    }
}

class Pair<A, B> {
    public final A fst;
    public final B snd;

    public Pair(A fst, B snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "fst=" + fst +
                ", snd=" + snd +
                '}';
    }
}