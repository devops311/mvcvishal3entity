package com.mindtree.vehiclebrands.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vehiclebrands.entity.Bike;
import com.mindtree.vehiclebrands.entity.Brand;
import com.mindtree.vehiclebrands.entity.Dealer;
import com.mindtree.vehiclebrands.exception.NoSuchDealerException;
import com.mindtree.vehiclebrands.repository.BikeRepository;
import com.mindtree.vehiclebrands.repository.DealerRepository;
import com.mindtree.vehiclebrands.service.BikeService;
@Service
public class BikeServiceImpl implements BikeService{
@Autowired
BikeRepository bikerepo;
@Autowired
DealerRepository dealerepo;

	@Override
	public List<Bike> getallbikes() {
		List<Bike>bikes=bikerepo.findAll();
		return bikes;
	}
	@Override
	public List<Bike> getbikesUnderDealer(String dealerName) throws NoSuchDealerException {
		if(dealerepo.existsBydealerName(dealerName)) {
	Dealer dealer=dealerepo.findBydealerName(dealerName);
	   Brand brand=dealer.getBrand();
	   List<Bike>bikes=brand.getBikes();
	   return bikes;
		}
		else {
			throw new NoSuchDealerException("invalid Dealer");
		}
		
		
	}

}
