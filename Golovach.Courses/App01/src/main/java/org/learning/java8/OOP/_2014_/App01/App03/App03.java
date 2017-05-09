package org.learning.java8.OOP._2014_.App01.App03;

import java.util.ArrayList;

public class App03 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String str = arr.get(0);
    }
}

class WithVersion<T extends Comparable<T>> implements Comparable<T> {
    public  T value;
    public long version;

    public WithVersion(T value, long version) {
        this.value = value;
        this.version = version;
    }

    @Override
    public int compareTo(T that) {
        return this.compareTo(that);
    }
}
