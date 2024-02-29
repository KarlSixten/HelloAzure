package org.example.azuretest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("HelloAzure")
public class AzureController {

    @RequestMapping("")
    public String getHello() {
        return "hello";
    }
}
