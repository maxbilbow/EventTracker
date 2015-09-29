package com.maxbilbow.camp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Max on 28/09/2015.
 */
@Controller
public class AdminController {

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String displayAdminPage(Model model) {
        model.addAttribute("greeting", "Welcome to the admin area");
        return "admin";
    }
}
