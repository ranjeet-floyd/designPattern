package com.futurefry.designPattern.observer;

public interface Subject {
	
	//
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	
	//notify all observer when Subject's state changed.
	void notifyObserver();

}
