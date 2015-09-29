package com.maxbilbow.repository;

import com.maxbilbow.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bilbowm on 29/09/2015.
 */
public interface EventRepository extends JpaRepository<Event, Long> {
}
