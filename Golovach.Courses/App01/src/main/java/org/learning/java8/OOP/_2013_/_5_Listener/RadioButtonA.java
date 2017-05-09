package org.learning.java8.OOP._2013_._5_Listener;

import static java.lang.Math.*;

public class RadioButtonA implements MouseListener {
    private int myX;
    private int myY;
    public boolean on = false;


    public RadioButtonA(int x, int y) {
        this.myX = x;
        this.myY = y;
        Mouse.addListener(this);
    }

    @Override
    public void mouseClicked(int x, int y) {
        if( sqrt(pow((myX - x), 2) + pow((myY - y), 2)) < 100) {
            on = true;
        }
    }
}
