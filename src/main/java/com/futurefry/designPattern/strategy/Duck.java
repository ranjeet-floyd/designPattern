package com.futurefry.designPattern.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){}
	
	//override
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All Duck floats ..even decoys !!");
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	

	
}
