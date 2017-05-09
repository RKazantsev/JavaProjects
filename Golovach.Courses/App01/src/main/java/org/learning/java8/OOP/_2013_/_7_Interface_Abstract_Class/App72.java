package org.learning.java8.OOP._2013_._7_Interface_Abstract_Class;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;

public class App72 {
    public static void main(String[] args) {

        // сильная типизация, компилятор обманули, но в runtime получаем ClassCastException
        //Integer ref = (Integer) (Object) "Hello!";

        // за счет стирания типов дженериков можно обойти и компилятор и рантайм
        //ArrayList<Integer> ref1 = (ArrayList<Integer>) (Object) new ArrayList<String>();

        ArrayList<String> str = new ArrayList<>();
        str.add("Hello!");
        ArrayList<Integer> ref1 = (ArrayList<Integer>) (Object) str;
        System.out.println(ref1.get(0));

        // поэтому запрещен Overloading с дженериками см App71

    }
}
