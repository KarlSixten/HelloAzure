package org.example.azuretest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AzureController {

    @RequestMapping("/")
    public String getHello() {
        return "hello";
    }
}
