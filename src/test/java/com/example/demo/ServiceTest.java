package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.CitiesDTO;
import services.ServiceCities;

class ServiceTest {
	ServiceCities serviceCities = new ServiceCities();


	@Test
	void FarhenheightOutputOfFiveIsFourtyOne() {
		String output = serviceCities.convertDegreesToFarhenheight(5);
		assertEquals(41, output);
		
	}
	
	@Test
	void FarhenheightOutputOfTwoIsThirtyFive() {
		String output = serviceCities.convertDegreesToFarhenheight(2);
		assertEquals(35, output);
		
	}
	
	@Test
	void ConvertName() {
		CitiesDTO sydney = new CitiesDTO("Sydney", "5", "21");
		String output = sydney.getName();
		assertEquals("Sydney", output);
		
		
	}
	
	@Test
	void ConvertTemperature() {
		CitiesDTO sydney = new CitiesDTO("Sydney", "5", "21");
		String output = sydney.getTemperatureInFahrenheit();
		assertEquals("5", output);
		
		
	}
	
	@Test
	void ConvertHumidity() {
		CitiesDTO sydney = new CitiesDTO("Sydney", "5", "21");
		String output = sydney.getHumidity();
		assertEquals("21", output);
	}


}
