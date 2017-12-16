package com.sapient.client;

import com.sapient.services.interest;

public class InterestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interest obj=new interest();
		obj.amt= 5000;
		obj.rate=2.5f;
		obj.years=2;
		double si=obj.simple();
		double ci=obj.comp();
		System.out.println("simple"+si);
		System.out.println("comp"+ci);

		
		interest obj2=new interest();
		obj.amt= amt;
		obj.rate=per;
		obj.years=years;
		double si=obj.simple();
		double ci=obj.comp();
		System.out.println("simple"+si);
		System.out.println("comp"+ci);

	}

}
