package com.futurefry.designPattern.observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private float temperature;
	private Subject weatherData;

	public ForecastDisplay(Subject _weatherData) {
		this.weatherData = _weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {

		System.out.println("Forcast : Temperature may be : " + this.temperature);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		display();
	}

}
