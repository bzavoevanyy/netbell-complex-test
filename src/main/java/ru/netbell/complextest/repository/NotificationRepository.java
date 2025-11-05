package ru.netbell.complextest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netbell.complextest.domain.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
