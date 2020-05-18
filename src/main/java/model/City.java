package model;

public class City {
	private String name;
	private int temperature;
	private int humidity;
	
	
	
	public String getName() {
		return name;
	}
	public City(String name, int temperature, int humidity) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.humidity = humidity;
	}
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	

}
