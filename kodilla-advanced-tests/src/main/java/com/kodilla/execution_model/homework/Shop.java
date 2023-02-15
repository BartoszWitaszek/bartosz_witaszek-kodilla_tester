package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders;

    public Shop() {
        this.orders = new HashSet<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> getOrdersWithinDateRange(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> order.getOrderDate().isAfter(startDate) && order.getOrderDate().isBefore(endDate))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrdersWithinValueRange(double orderMinValue, double orderMaxValue) {
        return orders.stream()
                .filter(order -> order.getOrderValue() >= orderMinValue && order.getOrderValue() <= orderMaxValue)
                .collect(Collectors.toSet());
    }

    public int getAmountOfOrders() {
        return orders.size();
    }

    public double getSumOfAllOrders() {
        return orders.stream()
                .mapToDouble(Order::getOrderValue)
                .sum();
    }
}