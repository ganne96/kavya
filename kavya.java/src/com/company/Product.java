package com.company;

import java.util.HashSet;
import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private String price;

    public Product(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        Product p1 = new Product(1, "Apple", "100");
        Product p2 = new Product(2, "Banana", "40");
        Product p3 = new Product(3, "Mangoes", "160");
        Product p4 = new Product(4, "Kiwi", "200");

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        for (Product p : products) {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice());
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;  // Fixed comparison
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price='" + price + "'}";
    }
}
