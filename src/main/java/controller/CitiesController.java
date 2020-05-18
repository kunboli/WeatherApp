 package controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.CitiesDTO;
import model.City;
import services.ServiceCities;

@RestController
public class CitiesController 

{	
	ServiceCities serviceCities = new ServiceCities();
	
	City a1 = new City ("Sydney", 10, 10);
	City a2 = new City ("Melbourne", 10, 10);
	
	@GetMapping("/cities")
	public List<City> getCities(){
		List<City> Cities = new ArrayList<>();
		

	
		Cities.add(a1);
		Cities.add(a2);
		
		return Cities;	
		
	
	}
	
	@GetMapping("/citiesDTO")
	public List<CitiesDTO> getCitiesDTO() {
	List<CitiesDTO> CitiesDTO = new ArrayList<>();
	
		
		CitiesDTO a3 = serviceCities.convert(a1);
		CitiesDTO a4 = serviceCities.convert(a2);
		
		CitiesDTO.add(a3);
		CitiesDTO.add(a4);
		
		return CitiesDTO;
	
	}
}
