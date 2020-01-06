package com.mindtree.vehiclebrands.service;

import java.util.List;

import com.mindtree.vehiclebrands.entity.Brand;

public interface BrandService {

	

	void assignbrandtodealer(String dealerName, String brandName);

	List<Brand> getAllbrands();

	void assignbikes(String bikeName, String brandName);

	int gettotalsinvestment(String brandName);

}
