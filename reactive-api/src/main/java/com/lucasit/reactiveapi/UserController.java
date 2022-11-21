package com.lucasit.reactiveapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    Mono<User> create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    Flux<User> list() {
        WebClient.create().get().uri("https://jsonplaceholder.typicode.com/todos")
                .retrieve()
                .bodyToFlux(String.class)
                .subscribe(System.out::println);
        return userRepository.findAll();
    }
}
