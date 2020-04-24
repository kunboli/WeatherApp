package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitiesResource 

{	
	@GetMapping("/cities")
	public List<City> getCities(){
		List<City> Cities = new ArrayList<>();
		
		City a1 = new City();
		a1.setName("Sydney");
		a1.setHumidity(23);
		a1.setTemperature(99);
		
		City a2 = new City();
		a2.setName("Melbourne");
		a2.setHumidity(55);
		a2.setTemperature(33);
		
		Cities.add(a1);
		Cities.add(a2);
		
		return Cities;		
	}
}
