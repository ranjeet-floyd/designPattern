package com.futurefry.designPattern.observer;

public interface Observer {

	//Implemented by all observer to get notify about WeaterData
	void update(float temp, float humidity, float pressure);
}
