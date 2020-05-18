package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class CitiesDTO {
	@Id
	private String name;
	private String temperatureInFahrenheit;
	private String humidity;
	
	public CitiesDTO(String name, String temperatureInFahrenheit, String humidity) {
	this.name = name;
	this.temperatureInFahrenheit = temperatureInFahrenheit;
	this.humidity = humidity;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemperatureInFahrenheit() {
		return temperatureInFahrenheit;
	}
	public void setTemperatureInFahrenheit(String temperatureInFahrenheit) {
		this.temperatureInFahrenheit = temperatureInFahrenheit;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	
	
	

}
