package com.futurefry.designPattern.observer;

public class StatsConditionDisplay implements Observer, DisplayElement {

	private float humidity;
	private Subject weatherData;

	public StatsConditionDisplay(Subject _weatherData) {
		this.weatherData = _weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {

		System.out.println("Stats current Humidity : " + this.humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {

		this.humidity = humidity;
		display();
	}

}
