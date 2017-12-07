package com.example.thymeleafogren.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class WelcomeController {
    @RequestMapping("/HelloWorld")
    public String hello(Map<String, String> model, @RequestParam(value = "name",required = false) String name) {
        if (name == null) {
            name = "Emre";
        }
        model.put("name", name);
        return "hello";
    }
}
