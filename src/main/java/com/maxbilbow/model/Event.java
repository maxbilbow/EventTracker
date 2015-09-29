package com.maxbilbow.model;

import com.maxbilbow.view.EventName;

import javax.persistence.*;
import java.util.List;

@Entity
public class Event {

	@Id
	@GeneratedValue
	private Long id;

	@EventName
	private String name;

	@ManyToMany(fetch = FetchType.EAGER)
	private List<Attendee> attendeeList;

	@Transient
	private int numberOfAttendees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Attendee> getAttendeeList() {
		return attendeeList;
	}

	public void setAttendeeList(List<Attendee> attendeeList) {
		this.attendeeList = attendeeList;
	}

	public int getNumberOfAttendees() {
		return numberOfAttendees = attendeeList.size();
	}
}
