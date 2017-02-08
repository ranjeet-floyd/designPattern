package com.futurefry.designPattern.chainOfResponsibility;

public class Substraction implements Chain {

	private static final String SUB_CAL = "sub";
	private Chain nextChain;

	public void setNext(Chain nextChain) {
		this.nextChain = nextChain;

	}

	public void calculate(Numbers request) {
		if (request.getCaluationWanted() == SUB_CAL) {
			System.out.println(request.getNumber1() + " - " + request.getNumber2() + " "
					+ (request.getNumber1() - request.getNumber2()));

		}
		else{
			this.nextChain.calculate(request);
		}
	}

}
