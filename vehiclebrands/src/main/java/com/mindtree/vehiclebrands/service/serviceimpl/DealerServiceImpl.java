package com.mindtree.vehiclebrands.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vehiclebrands.entity.Dealer;
import com.mindtree.vehiclebrands.repository.DealerRepository;
import com.mindtree.vehiclebrands.service.DealerService;
@Service
public class DealerServiceImpl implements DealerService{
@Autowired
DealerRepository dealerepo;
	@Override
	public List<Dealer> getAlldealers() {
		List<Dealer>dealers=dealerepo.findAll();
		return dealers;
	}

}
