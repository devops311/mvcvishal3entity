package com.mindtree.vehiclebrands.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	private String brandName;
	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
	private List<Bike> bikes;
	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
	private List<Dealer> dealers;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(int brandId, String brandName, List<Bike> bikes, List<Dealer> dealers) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.bikes = bikes;
		this.dealers = dealers;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<Bike> getBikes() {
		return bikes;
	}

	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}

	public List<Dealer> getDealers() {
		return dealers;
	}

	public void setDealers(List<Dealer> dealers) {
		this.dealers = dealers;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", bikes=" + bikes + ", dealers=" + dealers
				+ "]";
	}

}
