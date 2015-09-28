package com.pluralsight.repository;

import com.pluralsight.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bilbowm on 28/09/2015.
 */
@Repository("candidateRepository")
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
