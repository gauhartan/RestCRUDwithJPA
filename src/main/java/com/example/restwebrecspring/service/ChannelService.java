package com.example.restwebrecspring.service;

import com.example.restwebrecspring.model.Channel;
import com.example.restwebrecspring.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepository channelRepository;

    public List<Channel> findAll() {
        return channelRepository.findAll();
    }

    public Optional<Channel> findChannelById(Long id) {
        return channelRepository.findById(id);
    }

    public Channel create(Channel channel) {
        return channelRepository.save(channel);
    }

    public void deleteChannelById(Long id) {
        channelRepository.deleteById(id);
    }

    public Channel update(Channel channel) {
        return channelRepository.save(channel);
    }


}
