package ru.netbell.complextest.service.sender.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.netbell.complextest.domain.Notification;
import ru.netbell.complextest.service.sender.NotificationSender;

import java.util.List;

@Slf4j
@Service
public class RestNotificationSender implements NotificationSender {

    @Override
    public void sendNotification(final Notification notification) {
        log.info("Notification sent by Rest: {}, email addresses: {}", notification, List.of());
    }
}
