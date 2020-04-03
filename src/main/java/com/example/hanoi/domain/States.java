package com.example.hanoi.domain;

import lombok.Builder;
import lombok.Value;

/**
 * @author xuhanghe
 */

@Value
@Builder
public class States {

    long subscribers;

    long totalVideos;

    long totalViews;

    long ranking;
}
