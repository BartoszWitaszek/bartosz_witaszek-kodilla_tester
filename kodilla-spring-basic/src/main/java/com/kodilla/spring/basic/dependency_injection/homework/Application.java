package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DPDDeliveryService dpdDeliveryService = new DPDDeliveryService();
        NotiNotificationService notiNotificationService = new NotiNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(dpdDeliveryService, notiNotificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}