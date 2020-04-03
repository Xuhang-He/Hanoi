package com.example.hanoi.service;

import com.example.hanoi.domain.Channel;

/**
 * @author xuhanghe
 */
public interface ChannelService {

    Channel getChannel(String id);

    Channel createChannel(Channel channel);
}
