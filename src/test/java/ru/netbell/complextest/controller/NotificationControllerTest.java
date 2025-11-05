package ru.netbell.complextest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import ru.netbell.complextest.BaseIntegrationTest;
import ru.netbell.complextest.dto.CreateNotificationCommand;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class NotificationControllerTest extends BaseIntegrationTest {

    @Test
    @Sql(scripts = "classpath:db/scripts/clear.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    void createNotification() throws Exception {
        mockMvc.perform(post("/v1/notification")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(CreateNotificationCommand.builder()
                                .message("test message")
                                .build())))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.message").value("test message"))
                .andDo(print());
    }
}