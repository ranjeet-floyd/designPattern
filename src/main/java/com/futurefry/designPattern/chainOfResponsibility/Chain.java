package com.futurefry.designPattern.chainOfResponsibility;

public interface Chain {
	void setNext(Chain nextChain);
	
	void calculate(Numbers request);

}
