package com.jdc.student.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.ElementCollection;
import javax.persistence.CollectionTable;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.AttributeOverrides;
import javax.persistence.JoinColumn;

@Entity
public class ClassRoom implements Serializable {

	private static final long serialVersionUID = 1L;

	public ClassRoom() {
	}

	private LocalTime endTime;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Teacher teacher;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Course course;

	@ElementCollection
	@CollectionTable(name = "class_days")
	private List<Day> days;

	@EmbeddedId
	@AttributeOverrides({			
		@AttributeOverride(name = "teacherId", column = @Column(name = "teacher_id")),
		@AttributeOverride(name = "courseId", column = @Column(name = "course_id")) 
	})
	private ClassRoomPK id;

	public enum Day {
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}

	public ClassRoomPK getId() {
		return id;
	}

	public void setId(ClassRoomPK id) {
		this.id = id;
	}

}