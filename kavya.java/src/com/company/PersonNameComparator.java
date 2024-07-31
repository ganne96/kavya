package com.company;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person1> {
    @Override
    public int compare(Person1 p1, Person1 p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
