package com.futurefry.designPattern.chainOfResponsibility;

public class Numbers {
	private int number1;
	private int number2;
	private String caluationWanted;
	
	
	
	public Numbers(int _num1,  int _num2,  String _calWanted){
		this.number1 = _num1;
		this.number2 = _num2;
		this.caluationWanted = _calWanted;
	}
	
	public int getNumber2(){
		return number2;
	}
	
	public void setNumber2(int number2){
		this.number2 = number2;
	}
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public String getCaluationWanted() {
		return caluationWanted;
	}
	public void setCaluationWanted(String caluationWanted) {
		this.caluationWanted = caluationWanted;
	}
	
	

}
