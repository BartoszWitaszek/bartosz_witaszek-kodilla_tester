package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Warehouse {
    private Set<Order> orderList = new HashSet<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> optionalOrder = orderList
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst();

        if (optionalOrder.isPresent())
            return optionalOrder.get();
        throw new OrderDoesntExistException();
    }
}