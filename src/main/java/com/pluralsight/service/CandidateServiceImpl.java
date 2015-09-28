package com.pluralsight.service;

import com.pluralsight.model.Candidate;
import com.pluralsight.repository.CandidateRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;

/**
 * Created by bilbowm on 28/09/2015.
 */
//@ComponentScan("com.pluralsight.repository")
//@Service("candidateService")
public class CandidateServiceImpl extends AbstractEntityService<Candidate> implements EntityService<Candidate> {

    @Resource
    private CandidateRepository candidateRepository;

    @Override
    protected JpaRepository<Candidate, Long> repository() {
        return candidateRepository;
    }
}
