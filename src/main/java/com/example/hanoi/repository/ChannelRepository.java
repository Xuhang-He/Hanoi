package com.example.hanoi.repository;

import com.example.hanoi.domain.Channel;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author xuhanghe
 */
public interface ChannelRepository extends MongoRepository<Channel, String> {

    public Channel findChannelById(String id);
}
