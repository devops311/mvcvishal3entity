package com.mindtree.vehiclebrands.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.vehiclebrands.entity.Dealer;
@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer>{

	Dealer findBydealerName(String dealerName);

	boolean existsBydealerName(String dealerName);

}
