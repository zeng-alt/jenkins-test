package com.zjj.jenkinstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengJiaJun
 * @version 1.0
 * @crateTime 2025年07月23日 13:40
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);


    @GetMapping
    public ResponseEntity<String> test() {
        for (int i = 0; i < 100; i++) {
            log.info("test===================test");
        }
        return ResponseEntity.ok("hello world");
    }
}
