package com.company.sixteen;

public final class Dish implements Item{
    private int cost;
    private String description;
    private String name;

    public Dish(int cost, String description, String name) {
        this.cost = cost;
        this.description = description;
        this.name = name;
    }

    public Dish(String description, String name) {
        this.cost = 0;
        this.description = description;
        this.name = name;
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
    public int getCost() {
        return 0;
    }

    @Override
    public String getDesc() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString(){
        return "Dish: price = " + cost + "; description = " + description
                + "; name = " + name;
    }
}
