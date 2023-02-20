package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {
    Map<Localization, Set<Client>> localizationClientNotificationMap = new HashMap<>();

    public void addLocalization(Localization localization) {
        localizationClientNotificationMap.put(localization, new HashSet<>());
    }

    public void subscribeToParticularLocalization(Localization localization, Client client) {
        localizationClientNotificationMap.get(localization).add(client);
    }

    public void unsubscribeFromParticularLocalization(Localization localization, Client client) {
        localizationClientNotificationMap.get(localization).remove(client);
    }

    public void unsubscribeFromAllLocalizations(Client client) {
        localizationClientNotificationMap.forEach((localization, clients) -> clients.remove(client));
    }

    public void sendNotificationToClientsSubscribedToParticularLocalization(Localization localization, Notification notification) {
        localizationClientNotificationMap.get(localization).forEach(client -> client.receive(notification));
    }

    public void sendNotificationToAllClients(Notification notification) {
        localizationClientNotificationMap.forEach((localization, clients) -> clients.forEach(client -> client.receive(notification)));
    }

    public void removeLocalization(Localization localization) {
        localizationClientNotificationMap.remove(localization);
    }
}