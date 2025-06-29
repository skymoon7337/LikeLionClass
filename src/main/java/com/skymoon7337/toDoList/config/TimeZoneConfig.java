package com.skymoon7337.toDoList.config;

import jakarta.annotation.PostConstruct;
import java.util.TimeZone;
import org.springframework.stereotype.Component;

@Component
public class TimeZoneConfig {

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }
}
