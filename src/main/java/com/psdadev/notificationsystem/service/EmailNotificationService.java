package com.psdadev.notificationsystem.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.psdadev.notificationsystem.model.User;

@Service
public class EmailNotificationService implements NotificationChannelService {

    static final Logger logger = LoggerFactory.getLogger(EmailNotificationService.class);

    @Override
    public void sendNotification(String message, User user) {
        logger.info("Sending email to {}: {}", user.getEmail(), message);
    }
}
