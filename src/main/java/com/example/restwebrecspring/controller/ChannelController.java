package com.example.restwebrecspring.controller;

import com.example.restwebrecspring.model.Channel;
import com.example.restwebrecspring.model.Message;
import com.example.restwebrecspring.service.ChannelService;
import com.example.restwebrecspring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/channels")
public class ChannelController {

    @Autowired
    private ChannelService channelService;
    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Channel> getChannels() {
        return channelService.findAll();
    }

    @PostMapping
    public Channel createChannel(@RequestParam String title) {
        Channel channel = new Channel();
        channel.setTitle(title);
        return channelService.create(channel);
    }

    @DeleteMapping("/{id}")
    public void deleteChannel(@PathVariable Long id) {
        channelService.deleteChannelById(id);
    }

    @PatchMapping("/{id}")
    public Channel updateChannel(@PathVariable Long id, @RequestBody Channel request) {
        Optional<Channel> channel = channelService.findChannelById(id);
        if (channel.isPresent()) {
            channel.get().setTitle(request.getTitle());
            channelService.update(channel.get());
        }
        return null;
    }

    @PutMapping("/{id}")
    public Message createMessage(@PathVariable Long id, @RequestBody Message message) {
        Optional<Channel> channel = channelService.findChannelById(id);
        if (channel.isPresent()) {
            message.setChannel(channel.get());
            messageService.create(message);
            return message;
        }
        return null;
    }

    @GetMapping("/{id}")
    public List<Message> getMessagesByChannelId(@PathVariable Long id) {
        Optional<Channel> channel = channelService.findChannelById(id);
        if (channel.isPresent()) {
            return messageService.findMessagesByChannel(channel.get());
        }
        return null;
    }
}

