package com.lakshmi;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class Product {

    Map<String, Integer> products;

    @PostConstruct
    public void setUp() {
        this.products = new ConcurrentHashMap<>();
    }

    public void givingThePrices(String product, int price) {
        System.out.println("giving the price " +product+ "to: " +price);
        this.products.put(product,price);
    }
    public int totalPrice(String product, int count) {
        System.out.println("calculating" +products);
        return this.products.get(product) * count;

    }
}
