package com.cg.ofda.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.ofda.dto.AddressDto;
import com.cg.ofda.dto.ItemDto;
import com.cg.ofda.dto.RestaurantDto;
import com.cg.ofda.exception.RestaurantException;
import com.cg.ofda.repository.IRestaurantRepository;
@Service
public class IRestaurantServiceImpl implements IRestaurantService{

		@Autowired
		IRestaurantRepository restaurantRepository;

		@Override
		public RestaurantDto addRestaurant(RestaurantDto res) throws RestaurantException {
//			if(restaurantRepository.existsById(res.getRestaurantId()))
//				throw new RestaurantException("Restaurant already exists");
			return restaurantRepository.save(res);
		}

//		@Override
//		public RestaurantDto updateRestaurant(RestaurantDto res) {
//			return restaurantRepository.save(res);
//		}

//		@Override
//		public RestaurantDto removeRestaurant(String restaurantId) {
//			RestaurantDto r = restaurantRepository.findById(restaurantId).get();
//			restaurantRepository.deleteById(restaurantId);
//			return  r;
//
//		}
//		@Override
//		public RestaurantDto viewRestaurant(String restaurantId) {
//			Optional<RestaurantDto> findById = restaurantRepository.findById(restaurantId);
//			return findById.orElseThrow(() -> new RestaurantException("There are no restaurant having id:" + restaurantId));
//		}


//		@Override
//		public List<RestaurantDto> viewRestaurantNearBy(String location){
//			List<RestaurantDto> rest=restaurantRepository.findAll();
//			List<RestaurantDto> restaurants=new ArrayList<>();
//			for(RestaurantDto r:rest)
//			{
//				AddressDto address=r.getAddress();
//				if(address.getCity().equals(location))
//				{
//					restaurants.add(r);
//				}
//			}
//			
//			return restaurants;
//		}

//		@Override
//		public List<RestaurantDto> viewRestaurantByItemName(String name) {
//			List<RestaurantDto> r= restaurantRepository.findAll();
//			List<RestaurantDto> rest=new ArrayList<>();
//			for(RestaurantDto l:r)
//			{
//				List<ItemDto> items=l.getItem();
//				for(ItemDto item:items)
//				{
//					if(item.getItemName().equals(name))
//						rest.add(l);
//				}
//				
//			}
//			return rest;
//		
//		}
//
//		public List<String> getAllCities() {
//			// TODO Auto-generated method stub
//			return restaurantRepository.findAllDistinctCities();
//		}
		

}
