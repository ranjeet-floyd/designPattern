package com.futurefry.designPattern.observer;

public class WeatherStation {

	public static void main(String[] args) {
		// subject
		WeatherData weatherData = new WeatherData();

		// observer
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatsConditionDisplay statsDisplay = new StatsConditionDisplay(weatherData);
		ForecastDisplay forecast = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		// set weather data
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(80, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

		// currentDisplay.display();
		// openweatherdata api key : 7b7db4a725f76af988ca39bf5056da17

	}
}
