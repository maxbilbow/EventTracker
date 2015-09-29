package com.maxbilbow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.maxbilbow.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {

	@RequestMapping(value="/event", method = RequestMethod.GET)
	public String displayEventPage(Model model) {
		Event event = new Event();
		event.setName("Java User Group");
		model.addAttribute("event", event);
	
		return "event";
	}
	
	@RequestMapping(value="/event", method = RequestMethod.POST)
	public String processEvent(@ModelAttribute("event") Event event) {
		System.out.println(event);
		
		return "redirect:index.html";
	}

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public String displayEvents(ModelMap model) {
		return "events";
	}

}