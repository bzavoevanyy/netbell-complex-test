package ru.netbell.complextest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.netbell.complextest.domain.Notification;
import ru.netbell.complextest.dto.CreateNotificationCommand;
import ru.netbell.complextest.service.NotificationService;

@RestController
@RequestMapping("/v1/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Notification createNotification(@RequestBody CreateNotificationCommand createNotificationCommand) {
        return notificationService.createNotification(createNotificationCommand);
    }
}
