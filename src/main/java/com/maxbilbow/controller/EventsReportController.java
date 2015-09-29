package com.maxbilbow.controller;

import com.maxbilbow.model.Attendee;
import com.maxbilbow.model.Event;
import com.maxbilbow.repository.EventRepository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import java.util.List;

@RestController
@SessionAttributes("event")
public class EventsReportController {

    @Resource
    private EventRepository repository;

	@RequestMapping("/event-list")
	public List<Event> getEvents() {
		
		List<Event> events = repository.findAll();

        return events;
	}

	@RequestMapping(value = "/attendees", method = RequestMethod.GET)
	public List<Attendee> getAttendeesForEvent(ModelMap model) {
		Event event = (Event) model.get("event");

        System.out.println("Getting attendee list for event.");
		if (event != null)
			return event.getAttendeeList();

        System.err.println("WARNING: Event with attendee list was == null");
		return null;
	}

}
