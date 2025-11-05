package ru.netbell.complextest.dto;

import lombok.Builder;

@Builder
public record CreateNotificationCommand(
        String message
) {
}
