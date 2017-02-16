package com.futurefry.designPattern.decorates;

public class Super {

	//Broken | Constructor invokes an overridable method.
	public Super() {
		overrideMe();
	}
	public void overrideMe() {
		System.out.println("Super class override me.!!");
	}
	
}
