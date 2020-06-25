package com.docswebapps.msazuresandpit.web.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/")
public class HomePageController {
    @GetMapping
    public String home(@AuthenticationPrincipal OidcUser user, Model model) {
        model.addAttribute("message", "Welcome "+ user.getFullName() + ", you're successfully logged in !");
        model.addAttribute("year", LocalDate.now().getYear());
        return "homePage";
    }
}
