package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Student {
    int id;
    String name;
    String marks;

    public Student(int id, String name, String marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student obj1 = new Student(1, "Kavya", "84");
        Student obj2 = new Student(2, "Rama", "65");
        Student obj3 = new Student(3, "Teja", "90");
        Student obj4 = new Student(4, "Krishna", "69");
        Student obj5 = new Student(5, "Vasavi", "79");

        LinkedList<Student> list = new LinkedList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (Integer.parseInt(student.marks) > 70) {
                System.out.println(student);
            }
        }
        System.out.println(list);
    }

    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks='" + marks + "'}";
    }
}

