package com.knative.demo.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;

@WebFluxTest(KNativeDemoController.class)
class KNativeDemoControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void getMessage_success() {
        webTestClient.get()
                .uri("/demo")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody(String.class)
                .value(s -> assertEquals("Hello World", s));
    }
}