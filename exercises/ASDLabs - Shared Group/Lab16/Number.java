package com.asd.lab16.prob;



public class Number implements Expression{

	private int number;
    
	public Number(int number){ 
    	this.number = number; 
    }
    
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return number;
	}

}
