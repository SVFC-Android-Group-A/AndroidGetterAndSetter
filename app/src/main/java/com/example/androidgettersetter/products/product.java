package com.example.androidgettersetter.products;

public class product {
    private int price;
    private String name;

    private String category;

    public product() {}

    public product(int price, String name, String category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {return category;}

    public void setCategory(String category) {this.category = category;}
}