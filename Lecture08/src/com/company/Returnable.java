package com.company;

/**
 * Created by Ruslan.Kazantsev on 3/10/2016.
 */
public interface Returnable {
    default String doReturn() {
        return "Ok";
    }

    void doPrint();

}
