package com.example.hanoi.domain;

import com.example.hanoi.enums.Gender;
import com.example.hanoi.enums.Platform;

import lombok.Builder;
import lombok.Value;

/**
 * @author xuhanghe
 */

@Value
@Builder
public class Profile {

    String name;

    String region;

    Gender gender;

    Platform platform;

    String description;

    String homeUrl;
}
