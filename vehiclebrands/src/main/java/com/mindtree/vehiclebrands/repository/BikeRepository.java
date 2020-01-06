package com.mindtree.vehiclebrands.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.vehiclebrands.entity.Bike;
@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {

	Bike findBybikeName(String bikeName);

}
