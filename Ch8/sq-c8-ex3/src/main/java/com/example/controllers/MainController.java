package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(@RequestParam String color, @RequestParam String username, Model model) {
        model.addAttribute("color", color);
        if(username.isEmpty())
            model.addAttribute("username", "Katy");
        else
            model.addAttribute("username", username);

        return "home.html";
    }
}
