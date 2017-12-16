package com.sapient.services;

public class SalesPerson {
	public int id;
	public double samt;
	public String name;
    public static int noofPersons;
	
	public SalesPerson(int id, double samt, String name) {
		super();
		this.id = id;
		this.samt = samt;
		this.name = name;
		++noofPersons;
		
	}


	public double SalesComm() {
		double sc = 0;
		if (samt < 20000) {
			sc = samt * 0.03;
		} else if (samt >= 20000 & samt < 50000) {
			sc = samt * 0.05;
		} else {
			sc = samt * 0.1;
		}
		return sc;
	}
	public void display(){
		System.out.println(id +" "+ name +" "+ samt +"" + SalesComm()+ " ");
	}
}
