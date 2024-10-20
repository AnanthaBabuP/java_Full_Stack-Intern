package com.model;

import java.io.Serializable;

public class Participant implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String email;
    private String institute;
    private String gender;
    private String event;
    private String comments;
    private String agree;
    /**
     * Default Constructor
     */
    public Participant() {
		// TODO Auto-generated constructor stub
	}

	public Participant(String name, String email, String institute, String gender, String event,
			String comments) {
		this.name = name;
		this.email = email;
		this.institute = institute;
		this.gender = gender;
		this.event = event;
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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getAgree() {
		return agree;
	}

	public void setAgree(String agree) {
		this.agree = agree;
	}

}
