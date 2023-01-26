package com.kodilla.exception.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    private Warehouse warehouse;

    @BeforeEach
    public void setUp() {
        warehouse = new Warehouse();
        warehouse.addOrder(new Order("001"));
    }

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        Order order = warehouse.getOrder("001");

        assertEquals(new Order("001"), order);
    }

    @Test
    public void testGetOrder_withException() {
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("002"));
    }
}