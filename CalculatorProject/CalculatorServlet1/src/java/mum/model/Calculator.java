package mum.model;

public class Calculator {
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getSum() {
		return num1+num2;
	}
	
	public int getProduct() {
		return num1*num2;
	}

}
