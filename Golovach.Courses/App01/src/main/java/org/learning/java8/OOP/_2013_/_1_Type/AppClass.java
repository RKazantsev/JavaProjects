package org.learning.java8.OOP._2013_._1_Type;

public class AppClass {
    public static void main(String[] args) {
        Integer int0 = new Integer(0);
        Integer int1 = new Integer(1);

        Class cls0 = int0.getClass();
        Class cls1 = int1.getClass();

        System.out.println(cls0 == cls1);
        System.out.println(cls0.equals(cls1));

        System.out.println(int0 == int1);
        System.out.println(int0.equals(int1));

        Object obj = new Object();
        Class clsObj = obj.getClass();
        System.out.println(clsObj == cls0);
        System.out.println(clsObj.isAssignableFrom(cls0));
        System.out.println(cls0.isAssignableFrom(clsObj));
    }
}
