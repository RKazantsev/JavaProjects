package com.company;

/**
 * Created by Ruslan.Kazantsev on 3/10/2016.
 */
public class Loundry {

    public void clean(Cleanable thing) {
        System.out.println(thing.getClass().getSimpleName() + " clean with " + thing.howToClean() + " degree.");


    }
}
