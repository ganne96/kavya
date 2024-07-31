package com.company;

import java.util.ArrayList;

class Kavya {
    int id;
    String name;

    public Kavya(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kavya{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class List1 {
    public static void main(String[] args) {
        Kavya obj1 = new Kavya(44, "Kavya");

        ArrayList<Kavya> list = new ArrayList<>();
        list.add(obj1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
