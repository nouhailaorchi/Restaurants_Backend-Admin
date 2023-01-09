package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepository;


@RestController
@RequestMapping("restaurants")
@CrossOrigin
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepository;
	@PostMapping("/save")
	public void save(@RequestBody Restaurant restaurant){
	restaurantRepository.save(restaurant);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) String id){
	Restaurant s = restaurantRepository.findById(Integer.parseInt(id));
	restaurantRepository.delete(s);
	}
	@GetMapping("/all")
	public List<Restaurant> findAll(){
	return restaurantRepository.findAll();
	}
	@GetMapping(value = "/count")
	public long countRestaurant() {
	return restaurantRepository.count();
	}
	@GetMapping(value = "/byYear")
	public Collection<?> findByYear() {
	return RestaurantRepository.findNbrRestaurantByYear();
	}
	
	@GetMapping("/all/{id}")
	public Restaurant findById(@PathVariable Integer id) {
		//System.out.println("FindById "+id);
		return restaurantRepository.findById(id).isPresent() ? restaurantRepository.findById(id).get() : null;
	}

}

