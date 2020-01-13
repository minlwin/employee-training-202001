package com.jdc.orders.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class LineItem implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LineItemPK id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "ORDERID", insertable = false, updatable = false)
	private CustomerOrder order;
	@ManyToOne(optional = true)
	@JoinColumn(name = "vendorPartNumber")
	private VendorPart part;
	private int quantity;

	public LineItemPK getId() {
		return id;
	}

	public void setId(LineItemPK id) {
		this.id = id;
	}

	public CustomerOrder getOrder() {
		return order;
	}

	public void setOrder(CustomerOrder order) {
		this.order = order;
	}

	public VendorPart getPart() {
		return part;
	}

	public void setPart(VendorPart part) {
		this.part = part;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
