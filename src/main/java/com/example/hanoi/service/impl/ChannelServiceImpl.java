package com.example.hanoi.service.impl;

import com.example.hanoi.domain.Channel;
import com.example.hanoi.repository.ChannelRepository;
import com.example.hanoi.service.ChannelService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * @author xuhanghe
 */

@Service
@RequiredArgsConstructor
public class ChannelServiceImpl implements ChannelService {

    private final ChannelRepository channelRepository;

    @Override
    public Channel getChannel(final String id) {
        return channelRepository.findChannelById(id);
    }

    @Override
    public Channel createChannel(Channel channel) {
        return channelRepository.save(channel);
    }
}
