package com.company;

public class Main {
    public static void main(String[] args) {
        Fruit mango = new Mango();
        Grapes grapes = new Grapes();
        useFruit(mango);
        useFruit(grapes);
    }

    private static void useFruit(Fruit grapes) {
        grapes.color();
    }
}

