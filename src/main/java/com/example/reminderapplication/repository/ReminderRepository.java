package com.example.reminderapplication.repository;

import com.example.reminderapplication.dto.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {
}
