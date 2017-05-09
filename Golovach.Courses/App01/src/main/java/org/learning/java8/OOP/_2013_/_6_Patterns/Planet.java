package org.learning.java8.OOP._2013_._6_Patterns;

public enum Planet {
    VENUS(100), EARTH(1000), MARS(10_000);
    private double mass;

    Planet(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }
}

class App {
    public static void main(String[] args) {
        Planet p = Planet.MARS;
        double d = p.getMass();
        System.out.println(d + p.VENUS.getMass() + p.EARTH.getMass());
    }
}
