package com.thescientist.webtalker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/up")
    public String up() {
        return "up";
    }
}
