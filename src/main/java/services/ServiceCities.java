package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.CitiesDTO;
import model.City;
import repository.CitiesRepository;

@Service
public class ServiceCities {
	
	@Autowired
	CitiesRepository citiesRepository;
	
	//@Autowired
	//CitiesDTO citiesDTO;
	
	//public CitiesDTO convert(City city) {
	//	citiesDTO.setTemperatureInFahrenheit((city.getTemperature()*9/5)+32);
	//	citiesRepository.save(citiesDTO);
	//}

	public CitiesDTO convert(City city) {
		CitiesDTO cityDTO = new CitiesDTO(city.getName(), 
		convertDegreesToFarhenheight(city.getTemperature()),
		Integer.toString(city.getHumidity()));
		//citiesRepository.save(cityDTO);
		return cityDTO;
		
	}
	
	public String convertDegreesToFarhenheight(int temperature) {
		int fahrenheight = (temperature*9/5)+32; 
	
		return Integer.toString(fahrenheight);
	}
	
}
