package com.docswebapps.msazuresandpit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/")
public class HomePageController {
    @GetMapping
        public String home(Model model) {
        model.addAttribute("message", "Welcome Dave Collier, you're successfully logged in !");
        model.addAttribute("year", LocalDate.now().getYear());
        return "homePage";
    }
}
