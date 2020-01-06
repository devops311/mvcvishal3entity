package com.mindtree.vehiclebrands.service;

import java.util.List;

import com.mindtree.vehiclebrands.entity.Bike;
import com.mindtree.vehiclebrands.exception.NoSuchDealerException;

public interface BikeService {

	List<Bike> getallbikes();

	List<Bike> getbikesUnderDealer(String dealerName) throws NoSuchDealerException;

}
