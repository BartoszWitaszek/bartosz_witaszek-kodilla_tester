package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

class WeatherNotificationServiceTestSuite {
    private WeatherNotificationService weatherNotificationService;
    private Client client;
    private Client client2;
    private Client client3;
    private Client client4;
    private Notification notification;
    private Localization localization;
    private Localization localization2;

    @BeforeEach
    public void setUp() {
        weatherNotificationService = Mockito.spy(new WeatherNotificationService());
        client = Mockito.mock(Client.class);
        client2 = Mockito.mock(Client.class);
        client3 = Mockito.mock(Client.class);
        client4 = Mockito.mock(Client.class);
        notification = Mockito.mock(Notification.class);
        localization = Mockito.mock(Localization.class);
        localization2 = Mockito.mock(Localization.class);

        weatherNotificationService.addLocalization(localization);
        weatherNotificationService.addLocalization(localization2);
    }

    @Test
    public void testAddLocalization() {
        Mockito.verify(weatherNotificationService, Mockito.times(1)).addLocalization(localization);
    }

    @Test
    public void userShouldBeAbleToSubscribeToParticularLocalization() {
        weatherNotificationService.subscribeToParticularLocalization(localization, client);

        Mockito.verify(weatherNotificationService).subscribeToParticularLocalization(localization, client);
    }

    @Test
    public void clientsSubscribedToParticularLocalizationShouldBeNotified() {
        weatherNotificationService.subscribeToParticularLocalization(localization, client);
        weatherNotificationService.subscribeToParticularLocalization(localization2, client2);
        weatherNotificationService.sendNotificationToClientsSubscribedToParticularLocalization(localization, notification);
        weatherNotificationService.sendNotificationToClientsSubscribedToParticularLocalization(localization2, notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
    }

    @Test
    public void clientsUnsubscribedToParticularLocalizationShouldNotBeNotified() {
        weatherNotificationService.subscribeToParticularLocalization(localization2, client);
        weatherNotificationService.sendNotificationToClientsSubscribedToParticularLocalization(localization, notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void allClientsSubscribedToAnyLocalizationShouldReceiveNotification() {
        weatherNotificationService.subscribeToParticularLocalization(localization, client);
        weatherNotificationService.subscribeToParticularLocalization(localization, client2);
        weatherNotificationService.subscribeToParticularLocalization(localization2, client3);
        weatherNotificationService.subscribeToParticularLocalization(localization2, client4);

        weatherNotificationService.sendNotificationToAllClients(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
        Mockito.verify(client4, Mockito.times(1)).receive(notification);
    }

    @Test
    public void clientsAfterUnsubscribingShouldNotGetNotificationForParticularLocalization() {
        weatherNotificationService.subscribeToParticularLocalization(localization, client);
        weatherNotificationService.unsubscribeFromParticularLocalization(localization, client);
        weatherNotificationService.sendNotificationToClientsSubscribedToParticularLocalization(localization, notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void clientsAfterUnsubscribingToEveryLocalizationShouldNotGetNotifications() {
        weatherNotificationService.subscribeToParticularLocalization(localization, client);
        weatherNotificationService.subscribeToParticularLocalization(localization2, client);

        weatherNotificationService.unsubscribeFromAllLocalizations(client);

        weatherNotificationService.sendNotificationToAllClients(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void testRemoveLocalization() {
        weatherNotificationService.removeLocalization(localization);

        Mockito.verify(weatherNotificationService, Mockito.times(1)).removeLocalization(localization);
    }
}