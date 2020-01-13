package com.jdc.orders.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class PartDetails implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PartDetailsPK id;

	@Lob
	private byte[] drawing;
	@Lob
	private byte[] specification;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "PARTNUMBER", referencedColumnName = "PARTNUMBER", insertable = false, updatable = false),
		@JoinColumn(name = "REVISION", referencedColumnName = "REVISION", insertable = false, updatable = false) 
	})
	private Part part;

	public PartDetailsPK getId() {
		return id;
	}

	public void setId(PartDetailsPK id) {
		this.id = id;
	}

	public byte[] getDrawing() {
		return drawing;
	}

	public void setDrawing(byte[] drawing) {
		this.drawing = drawing;
	}

	public byte[] getSpecification() {
		return specification;
	}

	public void setSpecification(byte[] specification) {
		this.specification = specification;
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

}
