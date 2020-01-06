package com.mindtree.vehiclebrands.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.vehiclebrands.entity.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

	Brand findBybrandName(String brandName);

}
