package com.example.hanoi.domain;

import com.example.hanoi.enums.Gender;
import com.example.hanoi.enums.Platform;

import lombok.Value;

/**
 * @author xuhanghe
 */

@Value
public class Profile {

    String name;

    String region;

    Gender gender;

    Platform platform;

    String description;

    String homeUrl;
}
