package com.knative.demo.web;

import lombok.Getter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/demo")
@Getter
public class KNativeDemoController {

    @Value("${message.value}")
    private String message;

    @SneakyThrows
    @GetMapping
    public String showMessage() {
        return this.getMessage();
    }
}
