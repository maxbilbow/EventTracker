package com.maxbilbow.controller;

import com.maxbilbow.model.Event;
import com.maxbilbow.repository.EventRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@SessionAttributes("event")
public class EventController {

	@Resource
	private EventRepository repository;


	@RequestMapping(value="/event", method = RequestMethod.GET)
	public String displayEventPage(Model model) {
		Event event = new Event();
		event.setName("Java User Group... Bring all your mates!");
		model.addAttribute("event", event);
	
		return "event";
	}
	
	@RequestMapping(value="/event", method = RequestMethod.POST)
	public String processEvent(@Valid @ModelAttribute("event") Event event, BindingResult result) {
		System.out.println(event);

		if (result.hasErrors()) {
			return "event";
		}

		repository.save(event);

		return "redirect:index.html";
	}

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public String displayEvents(ModelMap model) {
		return "events";
	}

}
