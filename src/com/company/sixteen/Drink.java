package com.company.sixteen;

public final class Drink implements Item{
    private int cost;
    private String description;
    private String name;

    public Drink(int cost, String description, String name) {
        this.cost = cost;
        this.description = description;
        this.name = name;
    }

    public Drink(String description, String name) {
        this.description = description;
        this.name = name;
        this.cost = 0;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDesc() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Dish: price = " + cost + "; description = " + description
                + "; name = " + name;
    }
}
