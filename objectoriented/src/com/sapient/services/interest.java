package com.sapient.services;

public class interest {
	public double amt;
	public int years;
	public float rate;
	
	public double simple(){
		double si= amt*years*rate/100;
		return si;
	}
     
	public double comp(){
		double comp=amt*Math.pow((1+rate/100),years);
		return comp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
