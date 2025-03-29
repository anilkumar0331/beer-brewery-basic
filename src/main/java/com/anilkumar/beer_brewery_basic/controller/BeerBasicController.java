package com.anilkumar.beer_brewery_basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerBasicController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Beer Brewery!";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Beer Brewery!";
    }
}
