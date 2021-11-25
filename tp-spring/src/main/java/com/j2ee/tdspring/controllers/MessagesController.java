package com.j2ee.tdspring.controllers;

import com.j2ee.tdspring.entities.Messages;
import com.j2ee.tdspring.services.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessagesController {
    @Autowired
    private MessagesService messagesService;

    @GetMapping(path = "/messages")
    public Messages getMessages(@RequestParam(value = "id") Integer id) {
        return messagesService.getMessagesById(id);
    }

    @PutMapping("/messages")
    public Messages addOrUpdatePatients(@RequestBody Messages messages) {
        return messagesService.createOrUpdate(messages);
    }

    @GetMapping("/messages/all")
    public List<Messages> getMessages() {
        return messagesService.getMessages();
    }

    @DeleteMapping("/messages")
    public void deleteMessages(@RequestParam(value = "id") Integer id) {
    	messagesService.deleteMessages(id);
    }
}
