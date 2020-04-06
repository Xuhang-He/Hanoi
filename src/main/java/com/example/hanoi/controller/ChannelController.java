package com.example.hanoi.controller;

import com.example.hanoi.domain.Channel;
import com.example.hanoi.service.ChannelService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xuhanghe
 */

@RestController
@RequiredArgsConstructor
@Slf4j
public class ChannelController {

    private final ChannelService channelService;

    @GetMapping("/channel")
    @CrossOrigin(origins = "http://localhost:3000")
    public Channel getChannel(@RequestParam(value = "id") String id) {
        return channelService.getChannel(id);
    }

    @PostMapping("/channel")
    public void createChannel(@RequestBody Channel channel) {
        log.info("Incoming request for : {}", channel.getId());
        channelService.createChannel(channel);
    }
}
