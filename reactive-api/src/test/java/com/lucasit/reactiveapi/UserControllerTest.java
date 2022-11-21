package com.lucasit.reactiveapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    void test() {
        User user = new User(null, "user", "user@user.com.br", "123456");

        webClient.post().uri("/users").bodyValue(user)
                .exchange()
                .expectBody(User.class)
                .value(postResponse -> {
                    assertNotNull(postResponse.id());
                    assertEquals(user.username(), postResponse.username());
                    assertEquals(user.email(), postResponse.email());
                    assertEquals(user.password(), postResponse.password());
                });
    }

}