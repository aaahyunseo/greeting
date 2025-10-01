package com.example.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public Map<String, Object> hello() {
        Map<String, Object> response = new HashMap<>();
        response.put("koreaTime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString());
        response.put("timestamp", System.currentTimeMillis());
        response.put("message", "Hello, World!");
        return response;
    }

}
