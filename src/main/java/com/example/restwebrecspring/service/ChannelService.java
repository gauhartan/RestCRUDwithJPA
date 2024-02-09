package com.example.restwebrecspring.service;

import com.example.restwebrecspring.model.Channel;
import com.example.restwebrecspring.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepository channelRepository;

    public List<Channel> findAll() {
        return channelRepository.findAll();
    }

    public Channel create(Channel channel) {
        return channelRepository.save(channel);
    }

    public void deleteChannelById(Long id) {
        channelRepository.deleteById(id);
    }


}
