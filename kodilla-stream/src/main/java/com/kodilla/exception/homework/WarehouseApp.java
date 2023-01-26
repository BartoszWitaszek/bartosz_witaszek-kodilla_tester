package com.kodilla.exception.homework;

import java.util.Random;

public class WarehouseApp {
    public static void main(String[] args) {
        String orderNumber = "222";
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("111"));
        warehouse.addOrder(new Order("345"));
        warehouse.addOrder(new Order("555"));
        warehouse.addOrder(new Order("813"));
        warehouse.addOrder(new Order("712"));

        try {
            warehouse.getOrder(orderNumber);
            System.out.println("Found order: " + orderNumber);
        } catch (OrderDoesntExistException e) {
            System.out.println("Order " + orderNumber + " doesn't exist");
        }
    }
}
