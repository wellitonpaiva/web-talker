package com.thescientist.webtalker;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SpringConfig {

    @Scheduled(fixedDelay = 10000)
    public void scheduleFixedDelayTask() {
        System.out.println("Nangara nangara nangara una");
    }
}
