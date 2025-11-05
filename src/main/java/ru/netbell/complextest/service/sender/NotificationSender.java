package ru.netbell.complextest.service.sender;

import ru.netbell.complextest.domain.Notification;

public interface NotificationSender {

    void sendNotification(Notification notificationDto);
}
