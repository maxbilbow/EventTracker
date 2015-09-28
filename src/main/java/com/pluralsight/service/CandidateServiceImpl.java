package com.pluralsight.service;

import com.pluralsight.model.Candidate;
import com.pluralsight.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by bilbowm on 28/09/2015.
 */
//@ComponentScan("com.pluralsight.repository")
@Service("candidateService")
public class CandidateServiceImpl extends AbstractEntityService<Candidate> implements CandidateService {

    @Autowired
    private JpaRepository<Candidate, Long> candidateRepository;

    @Override
    protected JpaRepository<Candidate, Long> repository() {
        return candidateRepository;
    }
}
