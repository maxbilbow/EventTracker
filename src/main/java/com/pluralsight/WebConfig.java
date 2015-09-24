package com.pluralsight;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by bilbowm on 24/09/2015.
 */
@Configuration
@EnableWebMvc
public class WebConfig {

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("message","Hello, world!");
        return "index";
    }
}
