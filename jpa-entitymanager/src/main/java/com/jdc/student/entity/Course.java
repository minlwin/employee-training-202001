package com.jdc.student.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.OneToMany;

@Entity
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	public Course() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;

	private String name;

	private int duration;

	private int fees;

	@OneToMany(mappedBy = "course")
	private List<CourseContent> contents;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public List<CourseContent> getContents() {
		return contents;
	}

	public void setContents(List<CourseContent> contents) {
		this.contents = contents;
	}

}