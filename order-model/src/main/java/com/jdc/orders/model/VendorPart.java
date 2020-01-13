package com.jdc.orders.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class VendorPart implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long vendorPartNumber;
	private String description;
	private double price;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "vendorId")
	private Vendor vendor;
	@OneToOne(optional = true)
	private Part part;

	public long getVendorPartNumber() {
		return vendorPartNumber;
	}

	public void setVendorPartNumber(long vendorPartNumber) {
		this.vendorPartNumber = vendorPartNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

}
