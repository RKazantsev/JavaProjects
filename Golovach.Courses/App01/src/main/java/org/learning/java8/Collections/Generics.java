package org.learning.java8.Collections;

import java.util.Arrays;

public class Generics {
    public static void main(String[] args) {
        WithVersion<String> strV = new WithVersion<>("Mike", 10);
        WithVersion<int[]> intArrV = new WithVersion<>(new int[] {0, 1, 2}, 10);

        System.out.println(Arrays.toString(intArrV.getValue()));

        new WithVersion<>();


    }
}

class WithVersion<T> {
    private T value;
    private int version;

    public WithVersion(T value, int version) {
        this.value = value;
        this.version = version;

    }

    public WithVersion() {
        this.value = value;
        this.version = version;

    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}