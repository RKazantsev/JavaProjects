package org.learning.java8.OOP._2013_._1_Type;

public class App05 {
    public static void main(String[] args) {
        f(new int[] {10, 20 ,40}, 1);
        f("Hello!", 1);
    }
//  Плохой тон программирования, исользовать overloading
    /*public static void f(Object obj, int index) {
        if (obj instanceof int[]) {
            System.out.println(((int[]) obj)[index]);
        } else if (obj instanceof String) {
            System.out.println(((String) obj).charAt(index));
        } else {
            throw new IllegalArgumentException();
        }
    }*/
//    Overloading

    public static void f(int[] obj, int index) {
        System.out.println(obj[index]);
    }

    public static void f(String obj, int index) {
        System.out.println(obj.charAt(index));
    }

}
