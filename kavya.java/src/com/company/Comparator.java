package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1(28, "Kavya"));
        people.add(new Person1(25, "Rama"));
        people.add(new Person1(28, "Krishna"));
        Collections.sort(people);
        System.out.println("Sorted by age:");
        for (Person1 person : people) {
            System.out.println(person);
        }
        Collections.sort(people, new PersonNameComparator());
        System.out.println("\nSorted by name:");
        for (Person1 person : people) {
            System.out.println(person);
        }
    }
}