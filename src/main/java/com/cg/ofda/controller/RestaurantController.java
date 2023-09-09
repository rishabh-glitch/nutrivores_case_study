package com.cg.ofda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ofda.dto.RestaurantDto;
import com.cg.ofda.exception.RestaurantException;
import com.cg.ofda.service.IRestaurantServiceImpl;

@RestController
	@RequestMapping("/restaurant")
@CrossOrigin("*")
	public class RestaurantController {
		
		@Autowired
		IRestaurantServiceImpl restaurantService;

		
		@PostMapping("/addrestaurant")
		public RestaurantDto addRestaurant(@RequestBody RestaurantDto res) throws RestaurantException {
			return restaurantService.addRestaurant(res);
		}
		

//		@PutMapping("/updaterestaurant")
//		public RestaurantDto updateRestaurant( @RequestBody RestaurantDto res) {
//			return restaurantService.updateRestaurant(res);
//		}
//		
//
//		@DeleteMapping("/deleterestaurant/{id}")
//		public RestaurantDto removeRestaurant(@PathVariable("id")String restaurantId) {
//			return restaurantService.removeRestaurant(restaurantId);
//		}
//		
//
//		@GetMapping("/viewrestaurant/{id}")
//		public RestaurantDto viewRestaurant( @PathVariable("id") String restaurantId) {
//			return restaurantService.viewRestaurant(restaurantId);
//		}
//		
//
//		@GetMapping("/viewrestaurantnearby/{location}")
//		public List<RestaurantDto> viewRestaurantNearBy(@PathVariable("location")String location){
//			return restaurantService.viewRestaurantNearBy(location);
//		}
//		
//	
//		@GetMapping("/viewrestaurantbyitemname/{name}")
//		public List<RestaurantDto> viewRestaurantByItemName(@PathVariable String name){
//			return restaurantService.viewRestaurantByItemName(name);
//		}
//		@GetMapping("/getcities")
//	   public ResponseEntity<List<String>> getAllCities() {
//	        List<String> cities = restaurantService.getAllCities();
//	        return new ResponseEntity<>(cities, HttpStatus.OK);
//	    }

}
