package ru.netbell.complextest.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netbell.complextest.domain.Notification;
import ru.netbell.complextest.dto.CreateNotificationCommand;
import ru.netbell.complextest.mapper.NotificationMapper;
import ru.netbell.complextest.repository.NotificationRepository;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationMapper notificationMapper;

    @Transactional
    public Notification createNotification(CreateNotificationCommand createNotificationCommand) {
        return notificationRepository.save(notificationMapper.toEntity(createNotificationCommand));
    }
}
