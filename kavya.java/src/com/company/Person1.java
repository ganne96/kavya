package com.company;

public class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    public Person1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Person1 o) {
        return Integer.compare(this.age, o.age);
    }

    public String toString() {

        return name + " (" + age + " years old)";
    }
}


