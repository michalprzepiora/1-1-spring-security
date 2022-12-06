package com.kodilla.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/m1")
    public String m1(){
        return "Endpoint: m1";
    }

    @GetMapping("/m2")
    public String m2(){
        return "Endpoint: m2";
    }

    @GetMapping("/m3")
    public String m3(){
        return "Endpoint: m3";
    }
}
