package com.futurefry.designPattern.observer;

/*
 * Observe Weather data and display current temperature and humidity stats.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private final Subject weatherData;

	/*
	 * Pass the subject and register this class with subject.
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);

	}

	@Override
	public void display() {

		System.out.println("Current Conditions :   : " + temperature  + " F degress and " + humidity + " % humidity.");
	}

	/*
	 * when update is called update temperature and humidity and call display.
	 * 
	 * @see com.futurefry.designPattern.observer.Observer#update(float, float,
	 * float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {

		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
