package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DPDDeliveryService dpdDeliveryService, NotiNotificationService notiNotificationService) {
        this.deliveryService = dpdDeliveryService;
        this.notificationService = notiNotificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}