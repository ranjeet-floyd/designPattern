package com.futurefry.designPattern.decorates;

import java.util.Date;

public class Sub extends Super {
	private final Date date;

	public Sub() {
		date = new Date();
	}

	/*
	 Overriding method invoked by superclass constructor.
	 */
	@Override
	public void overrideMe() {
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();
	}

}
