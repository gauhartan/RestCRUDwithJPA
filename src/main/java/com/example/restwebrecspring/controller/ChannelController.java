package com.example.restwebrecspring.controller;

import com.example.restwebrecspring.model.Channel;
import com.example.restwebrecspring.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/channels")
public class ChannelController {

    @Autowired
    private ChannelService channelService;

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
}

