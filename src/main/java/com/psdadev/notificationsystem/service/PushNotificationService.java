package com.psdadev.notificationsystem.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.psdadev.notificationsystem.model.User;

public class PushNotificationService implements NotificationChannelService {

    static final Logger logger = LoggerFactory.getLogger(PushNotificationService.class);

    @Override
    public void sendNotification(String message, User user) {
        logger.info("Sending push notification to {}: {}", user.getName(), message);
    }

}
