package com.psdadev.notificationsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.psdadev.notificationsystem.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // Search users by specific category
    @Query("SELECT u FROM User u JOIN u.subscribedCategories c WHERE c.name = :categoryName")
    List<User> findByCategoryName(String categoryName);

    // Search users by specific notification channel
    @Query("SELECT u FROM User u JOIN u.notificationChannels nc WHERE nc.name = :channelName")
    List<User> findByChannelName(String channelName);
}
