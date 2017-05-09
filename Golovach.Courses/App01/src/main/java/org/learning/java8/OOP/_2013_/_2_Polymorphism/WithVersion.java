package org.learning.java8.OOP._2013_._2_Polymorphism;

class WithVersion<T extends Comparable<T>> implements Comparable<WithVersion<T>> {

    T object;
    int version;

    public WithVersion(T object, int version) {
        this.object = object;
        this.version = version;
    }

    @Override
    public int compareTo(WithVersion<T> o) {
        return this.object.compareTo(o.object) == 0 ? this.version : o.version;
    }
}

