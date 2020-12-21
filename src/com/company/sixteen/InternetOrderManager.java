package com.company.sixteen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class InternetOrderManager extends OrderManager{
    private final HashMap<String, Order> orders;

    public InternetOrderManager() {
        this.orders = new HashMap<>();
    }
    public boolean add(String address, Order order) {
        orders.put(address, order);
        return true;
    }
    public boolean delete(String address) {
        orders.computeIfPresent(address, (key, value) -> orders.remove(key));
        return true;
    }
    public Order getOrder(String address) {
        return Objects.requireNonNull(orders.entrySet().stream().filter(element -> element.getKey().equals(address))
                .findFirst().orElse(null)).getValue();
    }

    public void getAllOrders() {
        orders.forEach((key, value) -> System.out.println(key + ": " + Arrays.toString(value.getSortedArray())));
    }
    public boolean add(String address, Item item) {
        return getOrder(address).add(item);
    }
}
