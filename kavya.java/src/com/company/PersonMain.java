package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1(28, "Kavya"));
        people.add(new Person1(25, "Rama"));
        people.add(new Person1(28, "Krishna"));
        Collections.sort(people);
        for (Person1 person : people) {
            System.out.println(person);
        }
    }
}
