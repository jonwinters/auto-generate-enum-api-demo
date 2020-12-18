package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController  {

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Test{
        private String test;
    }

    @GetMapping("/test")
    public Test test() {
        return new Test("test");
    }
}
