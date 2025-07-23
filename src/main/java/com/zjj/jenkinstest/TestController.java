package com.zjj.jenkinstest;

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


    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("hello world");
    }
}
