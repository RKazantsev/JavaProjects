package org.learning.java8.OOP._2013_._2_Polymorphism;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if ((this.getName() == o.getName()) && (this.getAge() == o.getAge())) {
            return 0;
        }
        else return 1;
    }
}