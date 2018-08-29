package com.baeldung;

public class Syncronizer {
	
	private int aSum = 0;
	
	public int getSum() {
		return aSum;
	}
	
	public void setSum(int pSum) {
		this.aSum = pSum;
	}
	
	public void calculate() {
		setSum(getSum() + 1);
	}
	
}