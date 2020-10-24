package com.company.seven;

import java.util.ArrayList;

abstract public class Struct {

    private ArrayList<Integer> data;
    public ArrayList<Integer> getData() {
        return data;
    }
    public Struct() {
        this.data = new ArrayList<>();
    }

    abstract public boolean isEmpty();
    abstract public int pop();
    abstract public void push(int el);
    abstract public int get();
}
