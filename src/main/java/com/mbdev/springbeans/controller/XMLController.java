package com.mbdev.springbeans.controller;

import com.mbdev.springbeans.service.HelloXmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XMLController {


    private final HelloXmlService helloXmlService;

    @Autowired
    public XMLController(HelloXmlService helloXmlService) {
        this.helloXmlService = helloXmlService;
    }

    @GetMapping("/xml")
    public String helloXml() {
        return helloXmlService.hello();
    }
}
