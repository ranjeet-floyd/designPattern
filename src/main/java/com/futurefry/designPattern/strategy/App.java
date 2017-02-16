package com.futurefry.designPattern.strategy;

/**
 * The Strategy Pattern defines a family of algorithms, encapsulates each one,
 * and makes them interchangeable. Strategy lets the algorithm vary
 * independently from clients that use it.
 * 
 * @author ranjeet
 *
 */
public class App {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		// ...........
		Duck modelDuck = new ModelDuck();

		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		//
		DuckHunter duckHunter = new DuckHunter();
		duckHunter.peformQuack();

	}
}
