package com.jdc.student.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.OneToOne;

@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	public Student() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
	private int id;

    private String name;

    private Education education;

    @OneToOne(mappedBy = "student")
	private Contact contact;

    public enum Education {
        BEHS,
        College,
        Diploma,
        Others
    }

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

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

    
}