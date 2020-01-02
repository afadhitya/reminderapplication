package com.example.reminderapplication.controller;

import com.example.reminderapplication.dto.Reminder;
import com.example.reminderapplication.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @Autowired
    private ReminderService reminderService;

    @PostMapping("/save")
    public void saveReminder(@RequestBody Reminder reminder){
        reminderService.saveReminder(reminder);
    }

    @GetMapping("/all")
    public List<Reminder> getAllReminder(){
        return reminderService.getAllReminder();
    }

}
