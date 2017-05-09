package org.learning.java8.OOP._2013_._5_Listener;

import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class RadioButtonC implements OnListener {
    private int myX;
    private int myY;
    public boolean on = false;
    List<OnListener> listeners = new ArrayList<>();

    public RadioButtonC(int x, int y) {
        this.myX = x;
        this.myY = y;
        Mouse.addListener((x1, y1) -> {
            if (sqrt(pow((myX - x1), 2) + pow((myY - y1), 2)) < 10) {
                on = true;
                for (OnListener listener: listeners) {
                    listener.imOn();
                }
            }
        });

        // Используя динамическое наследование через анонимные классы можно оверрайдить только необходимые методы, а не весь список
        MouseInputListener listener = new BaseMouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        };
    }


    public void addListener(OnListener listener) {
        listeners.add(listener);
    }

    @Override
    public void imOn() {
        this.on = false;
    }
}
