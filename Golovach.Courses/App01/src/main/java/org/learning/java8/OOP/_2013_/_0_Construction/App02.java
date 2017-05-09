package org.learning.java8.OOP._2013_._0_Construction;


class X{
    X(int k){
        System.out.println("X(int)");
    }

    X(String str){
        this(0);
        System.out.println("X(String)");
    }
}

class Y extends X{
    Y(){
        super("");
        System.out.println("Y()");
    }
    Y(int k, int m) {
        this();
        System.out.println("Y(int, int)");
    }
}

class App02 {
    public static void main(String[] args) {
        new Y(0, 0);
    }
}
