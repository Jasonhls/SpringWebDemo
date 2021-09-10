package com.cn.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author: helisen
 * @Date 2021/9/10 10:36
 * @Description:
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @GetMapping(value = "/sayHello")
    public Mono<String> sayHello() {
        return Mono.just("Welcom to reactive world");
    }
}
