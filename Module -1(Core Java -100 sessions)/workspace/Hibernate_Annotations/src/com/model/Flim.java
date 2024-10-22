package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name = "flim")
public class Flim implements Serializable{
	
	@Id
	@Column(name = "flimid")
	@GenericGenerator (name = "ref",strategy = "increment")
	@GeneratedValue (generator = "ref")
	private int flimid;
	
	@Column(name = "flim_name")
	private String flimname;
	
	@Column(name = "flim_director")
	private String director;

	public Flim() {
	}

	public int getFlimid() {
		return flimid;
	}

	public void setFlimid(int flimid) {
		this.flimid = flimid;
	}

	public String getFlimname() {
		return flimname;
	}

	public void setFlimname(String flimname) {
		this.flimname = flimname;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
