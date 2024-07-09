package com.thc.smspr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class DefaultRestController {

    @GetMapping("/index")
    public String index(@RequestParam String test1, @RequestParam String test2) {
        return "hahaha" + test1+"///"+test2;
    }
}
