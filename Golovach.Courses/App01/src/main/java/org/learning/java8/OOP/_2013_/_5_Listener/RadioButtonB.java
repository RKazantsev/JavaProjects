package org.learning.java8.OOP._2013_._5_Listener;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class RadioButtonB implements MouseListener, OnListener {
    private int myX;
    private int myY;
    public boolean on = false;
    List<OnListener> listeners = new ArrayList<>();

    public RadioButtonB(int x, int y) {
        this.myX = x;
        this.myY = y;
        Mouse.addListener(this);
    }

    @Override
    public void mouseClicked(int x, int y) {
        if (sqrt(pow((myX - x), 2) + pow((myY - y), 2)) < 10) {
            this.on = true;
            for (OnListener listener: listeners) {
                listener.imOn();
            }
        }
    }

    public void addListener(OnListener listener) {
        listeners.add(listener);
    }

    @Override
    public void imOn() {
        this.on = false;
    }
}
