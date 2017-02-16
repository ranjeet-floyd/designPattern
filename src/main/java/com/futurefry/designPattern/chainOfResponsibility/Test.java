package com.futurefry.designPattern.chainOfResponsibility;

public class Test {
	public static void main(String[] args){
		
		Chain chain1 = new Addition();
		Chain chain2 = new Substraction();
		Chain chain3 = new Multiplication();
		Chain chain4 = new Divide();
		
		
		chain1.setNext(chain2);
		chain2.setNext(chain3);
		chain3.setNext(chain4);
		
		Numbers request = new Numbers(1,2,"dd");
		
		chain1.calculate(request);
	}

}
