package com.jdc.orders.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

@Entity
public class Part implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PartDetailsPK id;
	private String description;
	private Date revisionDate;

	@ManyToOne(optional = true)
	@JoinColumns({ 
		@JoinColumn(name = "BOMPARTNUMBER", referencedColumnName = "PARTNUMBER"), 
		@JoinColumn(name = "BOMREVISION", referencedColumnName = "REVISION") 
	})
	private Part bom;

	public PartDetailsPK getId() {
		return id;
	}

	public void setId(PartDetailsPK id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRevisionDate() {
		return revisionDate;
	}

	public void setRevisionDate(Date revisionDate) {
		this.revisionDate = revisionDate;
	}

	public Part getBom() {
		return bom;
	}

	public void setBom(Part bom) {
		this.bom = bom;
	}

}
