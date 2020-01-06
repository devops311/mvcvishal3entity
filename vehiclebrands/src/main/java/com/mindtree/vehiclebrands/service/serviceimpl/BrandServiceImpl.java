package com.mindtree.vehiclebrands.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mindtree.vehiclebrands.entity.Bike;
import com.mindtree.vehiclebrands.entity.Brand;
import com.mindtree.vehiclebrands.entity.Dealer;
import com.mindtree.vehiclebrands.repository.BikeRepository;
import com.mindtree.vehiclebrands.repository.BrandRepository;
import com.mindtree.vehiclebrands.repository.DealerRepository;
import com.mindtree.vehiclebrands.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService{
@Autowired
DealerRepository dealerepo;
@Autowired
BrandRepository brandrepo;
@Autowired
BikeRepository bikerepo;
	@Override
	public void assignbrandtodealer(String dealerName, String brandName) {
		
		Dealer dealer=dealerepo.findBydealerName(dealerName);
		Brand brand=brandrepo.findBybrandName(brandName);
		dealer.setBrand(brand);
		dealerepo.save(dealer);
		
	}
	@Override
	public List<Brand> getAllbrands() {
		List<Brand>brands=brandrepo.findAll();
		return brands;
	}
	@Override
	public void assignbikes(String bikeName, String brandName) {
	  Bike bike=bikerepo.findBybikeName(bikeName);
	  Brand brand=brandrepo.findBybrandName(brandName);
	  bike.setBrand(brand);
	  bikerepo.save(bike);
		
	}
	@Override
	public int gettotalsinvestment(String brandName) {
		Brand brand=brandrepo.findBybrandName(brandName);
		List<Bike>bikes=brand.getBikes();
		int total = 0;
		for (Bike bike : bikes) {
			total+=bike.getBikePrice();
		}
		return total;
	}

}
