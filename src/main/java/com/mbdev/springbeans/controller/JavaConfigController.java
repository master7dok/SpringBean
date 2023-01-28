package com.mbdev.springbeans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaConfigController {

    private final JavaConfigService javaConfigService;

    @Autowired
    public JavaConfigController(JavaConfigService javaConfigService) {
        this.javaConfigService = javaConfigService;
    }

    @Autowired


    @GetMapping("/java")
    public String hello() {
        return javaConfigService.hello();
    }
}
