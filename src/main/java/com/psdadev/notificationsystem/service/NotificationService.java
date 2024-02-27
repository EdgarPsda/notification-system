package com.psdadev.notificationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.psdadev.notificationsystem.model.User;

public class NotificationService {

    @Autowired
    private EmailNotificationService emailNotificationService;

    @Autowired
    private SmsNotificationService smsNotificationService;

    @Autowired
    private PushNotificationService pushNotificationService;

    public void sendNotification(User user, String message) {
        user.getNotificationChannelTypes().forEach(channel -> {
            switch (channel.getName()) {
                case "EMAIL":
                    emailNotificationService.sendNotification(message, user);
                    break;
                case "SMS":
                    smsNotificationService.sendNotification(message, user);
                    break;
                case "PUSH":
                    pushNotificationService.sendNotification(message, user);
                    break;
            }
        });
    }
}
