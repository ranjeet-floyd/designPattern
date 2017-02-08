package com.futurefry.designPattern.chainOfResponsibility;

public class Multiplication implements Chain {

	private static final String MUL_CAL = "mul";
	private Chain nextChain;

	public void setNext(Chain nextChain) {
		this.nextChain = nextChain;

	}

	public void calculate(Numbers req) {
		if (req.getCaluationWanted() == MUL_CAL) {
			System.out
					.println(req.getNumber1() + " * " + req.getNumber2() + " " + (req.getNumber1() * req.getNumber2()));
		}
		else{
			this.nextChain.calculate(req);
		}

	}

}
