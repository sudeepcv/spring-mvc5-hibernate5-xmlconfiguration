package com.sudeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PersonController {

    @GetMapping("/")
    public String hello() {
        System.out.println("inside hello");
        return "index";
    }

}