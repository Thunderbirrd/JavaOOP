package com.company.sixteen;

import java.util.Collection;

public class RestaurantOrderManager extends OrderManager{
    public RestaurantOrderManager() {}
    public RestaurantOrderManager(Collection<Item> items) {
        super(items);
    }
}

