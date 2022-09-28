package com.geekbrains.entites;

public class Product {
    public int id;
    public String title;
    public byte cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte getCost() {
        return cost;
    }

    public void setCost(byte cost) {
        this.cost = cost;
    }

    public Product(int i, String name, byte a ){
        this.id = i;
        this.title = name;
        this.cost = a;
    }
    public Product(){

    }
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' + ", cost = " + cost +
                '}';
    }
}
