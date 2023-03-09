package com.example.springbootjstl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr1", "hello world!");
        return "home";
    }
}
