package com.maxbilbow.controller;

import com.maxbilbow.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
public class AttendeeController {

	@Resource
	private JpaRepository<Attendee, Long> attendeeLongJpaRepository;

	@RequestMapping(value="/attendee", method = RequestMethod.GET)
	public String displayAttendeePage(Model model) {
		Attendee attendee = new Attendee();
		
		model.addAttribute("attendee", attendee);
		
		return "attendee";
	}
	
	@RequestMapping(value="/attendee", method = RequestMethod.POST)
	public String processAttendee(@Valid Attendee attendee, BindingResult result, Model m) {
		
		System.out.println(attendee);
		
		if(result.hasErrors()) {
			return "attendee";
		}

		attendeeLongJpaRepository.save(attendee);

		return "redirect:index.html";
		
	}
	
}
