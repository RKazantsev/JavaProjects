package org.learning.java8.Collections.App16;

class User0 {

    public String name;
    public int age;

    public User0(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        User0 that = (User0) obj;

        if (this.age != that.age) {
            return false;
        }

        return (this.name == that.name) || (this.name != null && this.name.equals(that.name));

//        if (this.name == null) {
//            if (that.name == null) {
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            if (that.name == null) {
//                return false;
//            } else {
//                return this.name.equals(that.name);
//            }
//        }
    }

    @Override
    public String toString() {
        return "User{" + name + ", " + age + "}";
    }
}
