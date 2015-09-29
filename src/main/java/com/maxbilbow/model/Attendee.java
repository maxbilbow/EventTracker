package com.maxbilbow.model;

import com.maxbilbow.view.Phone;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Attendee {

	@Id
	@GeneratedValue
	private Long id;

	@Size(min=2, max=30)
	private String name;
	
	@NotEmpty @Email
	private String emailAddress;

	@NotEmpty @Phone
	private String phone;

	@ManyToMany(fetch = FetchType.EAGER)
	private List<Event> events;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
}
