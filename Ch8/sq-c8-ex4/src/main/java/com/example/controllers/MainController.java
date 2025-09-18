package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home/{username}/{color}")
    public String home(@PathVariable String color, @PathVariable String username, Model model) {
        model.addAttribute("color", color);
        model.addAttribute("username", username);
        return "home.html";
    }
}
