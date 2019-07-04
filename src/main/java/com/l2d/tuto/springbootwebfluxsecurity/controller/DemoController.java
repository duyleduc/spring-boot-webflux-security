package com.l2d.tuto.springbootwebfluxsecurity.controller;

import com.l2d.tuto.springbootwebfluxsecurity.security.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * created by duc-d on 8/5/2018
 */
@RestController
@RequestMapping(value = "/api")
public class DemoController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Mono<String> hello(ServerWebExchange serverWebExchange,  @RequestParam String name) {

       return SecurityUtils.getUserFromRequest(serverWebExchange);
    }
}
