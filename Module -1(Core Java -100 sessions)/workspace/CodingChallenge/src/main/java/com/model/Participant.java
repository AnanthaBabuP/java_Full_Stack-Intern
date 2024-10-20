package com.model;

import java.io.Serializable;

public class Participant implements Serializable {
	
	private String name;
    private String email;
    private String institute;
    private String gender;
    private String events;
    private String comments;
    /**
     * Default Constructor
     */
    public Participant() {
		// TODO Auto-generated constructor stub
	}

	public Participant(String name, String email, String institute, String gender, String events,
			String comments) {
		this.name = name;
		this.email = email;
		this.institute = institute;
		this.gender = gender;
		this.events = events;
		this.comments = comments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEvents() {
		return events;
	}

	public void setEvents(String events) {
		this.events = events;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
