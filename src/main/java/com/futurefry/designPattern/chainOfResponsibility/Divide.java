package com.futurefry.designPattern.chainOfResponsibility;

public class Divide implements Chain {

	private static final String DIV_CAL = "div";
	private Chain nextChain;

	public void setNext(Chain nextChain) {
		this.nextChain = nextChain;

	}

	public void calculate(Numbers req) {

		if (req.getCaluationWanted() == DIV_CAL) {
			System.out
					.println(req.getNumber1() + " / " + req.getNumber2() + " " + (req.getNumber1() / req.getNumber2()));
		} else {
			System.out.println("Provided chain is not supported");
		}

	}

}
