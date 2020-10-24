package com.company.seven;

public class MyStack extends Struct {
    @Override
    public boolean isEmpty() {
        return getData().isEmpty();
    }

    public int pop(){
        return getData().remove(getData().size() - 1);
    }

    public void push(int el){
        getData().add(el);
    }

    public int get(){
        return getData().get(getData().size() - 1);
    }
}
