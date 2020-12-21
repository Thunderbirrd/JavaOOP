package com.company.sixteen;

import java.util.Arrays;
import java.util.Collection;

public class OrderManager implements Order{
    private final MyList<Item> data;

    public OrderManager(){
        this.data = new MyList<>();
    }
    public OrderManager(Collection<Item> items) {
        this.data = new MyList<>(items);
    }

    @Override
    public boolean add(Item item) {
        return data.add(item);
    }

    @Override
    public boolean delete(String name) {
        Item item = Arrays.stream(data.toArray()).filter(el -> el.getName().equals(name)).findFirst().orElse(null);
        if (item == null)
            return false;
        return data.remove(item);
    }

    @Override
    public int deleteAll(String name) {
        return (int) Arrays.stream(data.toArray()).filter(item -> item.getName().equals(name))
                .map(data :: remove).count();
    }

    @Override
    public int geOrdersQuantity() {
        return data.getSize();
    }

    @Override
    public Object[] getArray() {
        return data.toArray();
    }

    @Override
    public Object[] getSortedArray() {
        return Arrays.stream(data.toArray()).sorted((o1, o2) -> (o2.getCost() - o1.getCost())).toArray();
    }

    @Override
    public double getTotalPrice() {
        return (int) Arrays.stream(data.toArray()).mapToDouble(Item :: getCost).sum();
    }

    @Override
    public Object[] getNamesArray() {
        return  Arrays.stream(data.toArray()).map(Item :: getName).toArray();
    }
}
