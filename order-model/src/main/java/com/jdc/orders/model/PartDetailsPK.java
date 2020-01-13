package com.jdc.orders.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PartDetailsPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "PARTNUMBER")
	private String partNumber;
	@Column(name = "REVISION")
	private int revision;

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public int getRevision() {
		return revision;
	}

	public void setRevision(int revision) {
		this.revision = revision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partNumber == null) ? 0 : partNumber.hashCode());
		result = prime * result + revision;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PartDetailsPK other = (PartDetailsPK) obj;
		if (partNumber == null) {
			if (other.partNumber != null)
				return false;
		} else if (!partNumber.equals(other.partNumber))
			return false;
		if (revision != other.revision)
			return false;
		return true;
	}

}
