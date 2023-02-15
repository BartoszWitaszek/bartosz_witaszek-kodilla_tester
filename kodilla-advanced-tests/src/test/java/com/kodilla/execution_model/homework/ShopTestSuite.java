package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    private Shop shop;
    LocalDate localDate1 = LocalDate.of(2019, 11, 10);
    LocalDate localDate2 = LocalDate.of(2020, 5, 14);
    LocalDate localDate3 = LocalDate.of(2022, 7, 20);
    LocalDate localDate4 = LocalDate.of(2023, 2, 15);
    private Order testOrder1 = new Order(150.0, localDate1, "tester1");
    private Order testOrder2 = new Order(225.5, localDate2, "tester2");
    private Order testOrder3 = new Order(555.25, localDate3, "tester3");
    private Order testOrder4 = new Order(100.0, localDate4, "tester4");

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        shop.addOrder(testOrder1);
        shop.addOrder(testOrder2);
        shop.addOrder(testOrder3);
        shop.addOrder(testOrder4);
    }

    @Test
    public void testAddOrdersToShop() {
        assertEquals(4, shop.getAmountOfOrders());
    }

    @Test
    public void shouldReturnOrdersWithinDateRange() {

        Set<Order> ordersInDateRange = shop.getOrdersWithinDateRange(LocalDate.of(2020, 4, 1), LocalDate.of(2022, 8, 15));

        assertTrue(ordersInDateRange.contains(testOrder2));
        assertTrue(ordersInDateRange.contains(testOrder3));
        assertEquals(2, ordersInDateRange.size());
    }

    @Test
    public void shouldReturnOrdersWithinMinAndMaXValueRange() {
        Set<Order> ordersInValueRange = shop.getOrdersWithinValueRange(120.0, 300.0);

        assertTrue(ordersInValueRange.contains(testOrder1));
        assertTrue(ordersInValueRange.contains(testOrder2));
        assertEquals(2, ordersInValueRange.size());
    }

    @Test
    public void shouldSumValueOfAllOrders() {
        assertEquals(1030.75, shop.getSumOfAllOrders());
    }
}