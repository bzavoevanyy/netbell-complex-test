package ru.netbell.complextest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import ru.netbell.complextest.domain.Notification;
import ru.netbell.complextest.dto.CreateNotificationCommand;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface NotificationMapper {

    Notification toEntity(CreateNotificationCommand createNotificationCommand);
}