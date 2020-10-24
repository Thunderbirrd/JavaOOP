package com.company.seven;

public class Deque extends Struct {

    @Override
    public boolean isEmpty() {
        return getData().isEmpty();
    }

    @Override
    public int pop() {
        return getData().remove(0);
    }
    @Override
    public void push(int el) {
        getData().add(el);
    }

    @Override
    public int get() {
        return getData().get(0);
    }
}
