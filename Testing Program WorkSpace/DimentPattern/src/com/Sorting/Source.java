package com.Sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Participant {
	private String name;
	private int speed;
	private int lengthCapacity;

	Participant(String name, int speed, int lengthCapacity) {
		this.name = name;
		this.speed = speed;
		this.lengthCapacity = lengthCapacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setLengthCapacity(int lengthCapacity) {
		this.lengthCapacity = lengthCapacity;
	}

	public int getLengthCapacity() {
		return this.lengthCapacity;
	}

	@Override
	public String toString() {
		return "Participant [name=" + name + ", speed=" + speed + ", lengthCapacity=" + lengthCapacity + "]";
	}

}

class Race {
	// Define all the data members and methods here
	ArrayList<Participant> participants = new ArrayList<>();
	int totalTracks;
	int trackLength;

	public Race(int totalTracks, int trackLength) {
		this.totalTracks = totalTracks;
		this.trackLength = trackLength;
	}

	public String addParticipants(Participant participant) {
		if (trackLength <= participant.getLengthCapacity() && (totalTracks > participants.size())) {
			participants.add(participant);
			return "Start practicing";
		} else {
			return "Better luck next time";
		}
	}

	public String getWinner() {
		return "name of the participant that has the largest speed";
	}

	public String getLooser() {
		return "Name of Participant that has the least speed";
	}

}

public class Source {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Participant p1 = new Participant("Test1", 10, 300);
		Participant p2 = new Participant("Test2", 20, 400);
		Participant p3 = new Participant("Test3", 30, 100);
		Race r = new Race(10, 100);
		String result1 = r.addParticipants(p1);
		String result2 = r.addParticipants(p2);
		String result3 = r.addParticipants(p3);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(r.participants.toString());
		
	}
}