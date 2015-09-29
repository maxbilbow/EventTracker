package com.maxbilbow.camp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Max on 28/09/2015.
 */
@Controller
public class IndexController {

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello, World!");
        return "forward:index.html";
    }
}
