package com.futurefry.designPattern.chainOfResponsibility;

public class Addition implements Chain {

	private static final String ADD_CAL = "add";
	private Chain nextChain;

	public void setNext(Chain nextChain) {
		this.nextChain = nextChain;

	}

	public void calculate(Numbers request) {
		if (request.getCaluationWanted() == ADD_CAL) {
			System.out.println(request.getNumber1() + " +  " + request.getNumber2() + " "
					+ (request.getNumber1() + request.getNumber2()));
		}
		else{
			this.nextChain.calculate(request);
		}
	}

}
