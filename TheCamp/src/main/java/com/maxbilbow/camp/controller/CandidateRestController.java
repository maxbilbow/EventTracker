package com.maxbilbow.camp.controller;

import com.maxbilbow.camp.model.Candidate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Max on 28/09/2015.
 */
@RestController
public class CandidateRestController {

    @RequestMapping("/candidateList")
    public List<Candidate> getCandidates() {


        return Arrays.asList(
                new Candidate(),
                new Candidate(),
                new Candidate(),
                new Candidate()
        );
    }
}
