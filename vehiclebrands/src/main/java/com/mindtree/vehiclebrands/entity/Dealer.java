package com.mindtree.vehiclebrands.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dealer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int delaerId;
	private String dealerName;
	private String dealerAddress;
	@ManyToOne
	private Brand brand;

	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dealer(int delaerId, String dealerName, String dealerAddress, Brand brand) {
		super();
		this.delaerId = delaerId;
		this.dealerName = dealerName;
		this.dealerAddress = dealerAddress;
		this.brand = brand;
	}

	public int getDelaerId() {
		return delaerId;
	}

	public void setDelaerId(int delaerId) {
		this.delaerId = delaerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerAddress() {
		return dealerAddress;
	}

	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Dealer [delaerId=" + delaerId + ", dealerName=" + dealerName + ", dealerAddress=" + dealerAddress
				+ ", brand=" + brand + "]";
	}

}
