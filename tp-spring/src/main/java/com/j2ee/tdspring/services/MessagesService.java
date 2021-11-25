package com.j2ee.tdspring.services;

import com.j2ee.tdspring.entities.Messages;
import com.j2ee.tdspring.repositories.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesService{
    @Autowired
    private MessagesRepository messagesRepository;


    public Messages createOrUpdate(Messages messages) {
        return messagesRepository.save(messages);
    }

    public Messages getMessagesById(Integer id) {
        return messagesRepository.findById(id).orElse(null);
    }

    public List<Messages> getMessages() {
        return messagesRepository.findAll();
    }

    public void deleteMessages(Integer id) {
    	messagesRepository.deleteById(id);
    }

}
