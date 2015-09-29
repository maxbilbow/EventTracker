package com.maxbilbow.repository;

import com.maxbilbow.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bilbowm on 28/09/2015.
 */
//@Repository("candidateRepository")
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
