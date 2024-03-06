package com.example.restwebrecspring.service;

import com.example.restwebrecspring.model.Channel;
import com.example.restwebrecspring.model.Message;
import com.example.restwebrecspring.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message create(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> findMessagesByChannel(Channel channel) {
        return messageRepository.findMessagesByChannel(channel);
    }
}
