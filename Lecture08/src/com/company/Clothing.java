package com.company;

/**
 * Created by Ruslan.Kazantsev on 3/10/2016.
 */
abstract public class Clothing implements Returnable, Cleanable, Comparable<Clothing> {

    private String name;
    private int price;

    public Clothing(String name, int price) {
        this.name = name;
        this.price = price;
    }

    abstract public void wash(String name);

    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Clothing o) {
        return getPrice() - o.getPrice();
    }
}
