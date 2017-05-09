package com.company;

/**
 * Created by Ruslan.Kazantsev on 3/10/2016.
 */
public class Shirt extends Clothing implements Returnable, Cleanable {

    public Shirt(String name, int price) {
        super(name, price);
    }

    @Override
    public void wash(String name) {
        System.out.println(name + " is cleaning shirt.");
    }

    @Override
    public void doPrint() {
        System.out.println("Ok");
    }

    @Override
    public int howToClean() {
        return 30;
    }
}
