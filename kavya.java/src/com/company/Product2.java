package com.company;

import java.util.HashMap;
import java.util.Map;

class Product2 {
    private int id;
    private String name;
    private double price;  // Changed price to double

    public Product2(int id, String name, double price) {  // Corrected the constructor name
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {  // Changed return type to double
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class ProductMap {
    private Map<Integer, Product2> productMap;

    public ProductMap() {
        this.productMap = new HashMap<>();
    }

    public static void main(String[] args) {
        // Creating a ProductMap instance
        ProductMap productMap = new ProductMap();

        // Adding products to the map
        productMap.addProduct(new Product2(1, "Apple", 100.0));  // Changed price to double
        productMap.addProduct(new Product2(2, "Banana", 40.0));  // Changed price to double
        productMap.addProduct(new Product2(3, "Mangoes", 160.0));  // Changed price to double
        productMap.addProduct(new Product2(4, "Kiwi", 200.0));  // Changed price to double

        // Printing products from the map
        productMap.printProducts();
    }

    public void addProduct(Product2 product) {
        productMap.put(product.getId(), product);
    }

    public void printProducts() {
        for (Product2 product : productMap.values()) {
            System.out.println(product);
        }
    }
}
