package com.company.sixteen;

public interface Order {
    boolean add(Item item);
    boolean delete(String name);
    int deleteAll(String name);
    int geOrdersQuantity();
    Object[] getArray();
    Object[] getSortedArray();
    double getTotalPrice();
    Object[] getNamesArray();
}
