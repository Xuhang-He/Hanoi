package com.example.hanoi.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Value;

/**
 * @author xuhanghe
 */
@Value
public class MediaMaker {

    String id;

    Profile profile;

    States states;

    @Builder.Default
    List<Video> videos = new ArrayList<>();
}
