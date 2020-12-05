package com.genil.learning.airlines.baggage.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/baggage/customs")
public class CustomsController {
    @RequestMapping("/v1/welcome/{userName}")
    public String welcome(@PathVariable(name = "userName")String userName) {
        return "Welcome " + userName;
    }
}
