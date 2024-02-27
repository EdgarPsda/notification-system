package com.psdadev.notificationsystem.service;

import com.psdadev.notificationsystem.model.User;

public interface NotificationChannelService {
    void sendNotification(String message, User user);
}
