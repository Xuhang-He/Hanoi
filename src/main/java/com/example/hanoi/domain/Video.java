package com.example.hanoi.domain;

import com.example.hanoi.enums.Language;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Value;

/**
 * @author xuhanghe
 */

@Value
@Builder
public class Video {

    String id;

    String category;

    String url;

    int timeLength;

    long views;

    long comments;

    Date uploadDate;

    Language language;

    @Builder.Default
    List<String> tags = new ArrayList<>();
}
