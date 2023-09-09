package com.cg.ofda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cg.ofda.dto.RestaurantDto;

@Repository
	public interface IRestaurantRepository extends JpaRepository<RestaurantDto,Long>{
	
	@Query("SELECT DISTINCT r.city FROM AddressDto r")
	List<String> findAllDistinctCities();
		
	}

