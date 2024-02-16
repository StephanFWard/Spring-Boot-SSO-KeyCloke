package com.example.springbootssocloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("Hello endpoint accessed");
        return "Hello from TestController!";
    }
}
