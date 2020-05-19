package serviceCitiesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.City;
import services.ServiceCities;

class ServiceTest {
	ServiceCities serviceCities = new ServiceCities();


	@Test
	void FarhenheightOutputOfFiveIsFourtyOne() {
		String output = serviceCities.convertDegreesToFarhenheight(5);
		assertEquals("41", output);
		
	}
	
	@Test
	void FarhenheightOutputOfTwoIsThirtyFive() {
		String output = serviceCities.convertDegreesToFarhenheight(2);
		assertEquals("35", output);
		
	}
	
	@Test
	void Convert_Name() {
		City sydney = new City("Sydney", 5, 21);
		String output = serviceCities.convert(sydney).getName();
		assertEquals("Sydney", output);
		
		
	}
	
	@Test
	void Convert_Temperature() {
		City sydney = new City("Sydney", 5, 21);
		String output = serviceCities.convert(sydney).getTemperatureInFahrenheit();
		assertEquals("41", output);
		
		
	}
	
	
	@Test
	void Convert_Humidity() {
		City sydney = new City("Sydney", 5, 21);
		String output = serviceCities.convert(sydney).getHumidity();
		assertEquals("21", output);
	}


}
