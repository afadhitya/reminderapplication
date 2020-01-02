package com.example.reminderapplication.service;

import com.example.reminderapplication.dto.Reminder;
import com.example.reminderapplication.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderService {
    @Autowired
    private ReminderRepository reminderRepository;

    public void saveReminder(Reminder reminder){
        reminderRepository.save(reminder);
    }

    public List<Reminder> getAllReminder() {
        return reminderRepository.findAll();
    }
}
