package com.jdc.student.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.ManyToOne;

@Entity
public class Registration implements Serializable {

	private static final long serialVersionUID = 1L;

	public Registration() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long id;

	private LocalDate registDate;

	@ManyToOne
	private Student student;

	@ManyToOne
	private ClassRoom classRoom;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getRegistDate() {
		return registDate;
	}

	public void setRegistDate(LocalDate registDate) {
		this.registDate = registDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ClassRoom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}

}