package com.l2d.tuto.springbootwebfluxsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * created by duc-d on 8/5/2018
 */
@RestController
@RequestMapping(value = "/api")
public class DemoController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Mono<String> hello(@RequestParam String name) {
        return Mono.just("Hello " + name);
    }
}
