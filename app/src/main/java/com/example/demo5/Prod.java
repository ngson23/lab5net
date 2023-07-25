package com.example.demo5;

public class Prod {
    private String pid, name, price, description;

    public Prod() {

    }

    public Prod(String pid, String name, String price, String description) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
