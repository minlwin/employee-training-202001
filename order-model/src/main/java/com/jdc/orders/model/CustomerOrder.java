package com.jdc.orders.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Table(name = "CUSTOMERORDER")
public class CustomerOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDERID")
	private int orderId;
	@Column(name = "DISCOUNT")
	private int discount;
	@Column(name = "LASTUPDATE")
	@Temporal(TIMESTAMP)
	private Date lastUpdate;
	@Column(name = "SHIPMENTINFO")
	private String shipmentInfo;
	@Column(name = "STATUS")
	private char status;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getShipmentInfo() {
		return shipmentInfo;
	}

	public void setShipmentInfo(String shipmentInfo) {
		this.shipmentInfo = shipmentInfo;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
