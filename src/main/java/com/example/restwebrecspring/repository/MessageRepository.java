package com.example.restwebrecspring.repository;

import com.example.restwebrecspring.model.Channel;
import com.example.restwebrecspring.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findMessagesByChannel(Channel channel);
}
