package com.richard.hpai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RandomNumberController {
    @GetMapping("/random")
    public ResponseEntity<Mono<Integer>> getRandomNumber(){
        Integer value = (int) Math.floor(Math.random() * 10);
        return new ResponseEntity<>(Mono.just(value), HttpStatus.OK);
    }
}
