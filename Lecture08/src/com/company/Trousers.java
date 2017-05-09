package com.company;

/**
 * Created by Ruslan.Kazantsev on 3/10/2016.
 */
public class Trousers extends Clothing implements Returnable, Cleanable {

    public Trousers(String name, int price) {
        super(name, price);
    }

    @Override
    public void wash(String name) {
        System.out.println(name + " is cleaning trousers.");
    }

    @Override
    public void doPrint() {

    }

    @Override
    public int howToClean() {
        return 40;
    }
}
