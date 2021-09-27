package com.knative.demo.web;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Getter
public class KNativeDemoController {

    @Value("${message.value}")
    private String message;

    @GetMapping
    public String showMessage() {
        return this.getMessage();
    }
}
