package com.example.restwebrecspring.repository;

import com.example.restwebrecspring.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

    Optional<Channel> deleteAllById(Long id);
}
