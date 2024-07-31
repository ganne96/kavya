package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args) {
        List<Person> persons = loadPersons();
//        Person person = person.stream()
//                .filter(per -> per.getName().startWith("A"))
//                .findFirst()
//                .orElse
//              .collect(Collectors.toList());

        List<Person> otherPersons = persons.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());

        Map<String, Person> personMap = otherPersons.stream()
                .collect(Collectors.toMap(Person::getName, person -> person));
        System.out.println(personMap);
    }

    private static List<Person> loadPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Kavya", 25));
        persons.add(new Person("Rama", 22));
        persons.add(new Person("Krishna", 28));
        return persons;
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


