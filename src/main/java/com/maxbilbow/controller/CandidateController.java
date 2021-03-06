package com.maxbilbow.controller;

import com.maxbilbow.model.Candidate;
import com.maxbilbow.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * Created by bilbowm on 28/09/2015.
 */
@Controller
@SessionAttributes("candidate")
//@EnableAutoConfiguration
//@ComponentScan("com.maxbilbow.service")
public class CandidateController {

//    @Resource
//    @Qualifier("candidateService")
    @Autowired
    private CandidateService candidateService;

    @RequestMapping(value = "/newCandidate", method = RequestMethod.GET)
    public String displayNewCandidatePage(ModelMap model) {
        Candidate candidate = new Candidate();

        model.addAttribute("candidate", candidate);

        return "newCandidate";
    }

    @RequestMapping(value = "/newCandidate", method = RequestMethod.POST)
    public String addCandidate(@Valid Candidate candidate, BindingResult result, ModelMap model) {

        System.out.println(candidate);
        if (result.hasErrors()) {
            return "newCandidate";
        }

        candidateService.save(candidate);

        return "redirect:index.html";
    }
}
