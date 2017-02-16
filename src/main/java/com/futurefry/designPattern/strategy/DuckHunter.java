package com.futurefry.designPattern.strategy;

public class DuckHunter {

	private QuackBehavior quackBehavior;
	
	public DuckHunter(){
		quackBehavior = new MimicQuack();
	}
	
	public void peformQuack() {
		quackBehavior.quack();
	}
}
