package com.maxbilbow.repository;

import com.maxbilbow.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bilbowm on 29/09/2015.
 */
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
