package org.learning.java8.OOP._2013_._5_Listener;

public class Main {
    public static void main(String[] args) {
        RadioButtonB rb0 = new RadioButtonB(0, 0);
        RadioButtonB rb1 = new RadioButtonB(100, 100);
        RadioButtonB rb2 = new RadioButtonB(200, 200);

        rb0.addListener(rb1);
        rb0.addListener(rb2);
        rb1.addListener(rb0);
        rb1.addListener(rb2);
        rb2.addListener(rb0);
        rb2.addListener(rb1);

        System.out.println(rb0.on + " : " + rb1.on + " : " + rb2.on);
        Mouse.click(50, 50);
        System.out.println(rb0.on + " : " + rb1.on + " : " + rb2.on);
        Mouse.click(3, 3);
        System.out.println(rb0.on + " : " + rb1.on + " : " + rb2.on);
        Mouse.click(105, 105);
        System.out.println(rb0.on + " : " + rb1.on + " : " + rb2.on);


    }
}
