package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.circle;

public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		circle obj= new circle();
		System.out.println("enter the radius");
		obj.radius= scan.nextDouble();
		System.out.println("AREA IS"+ obj.area());
		System.out.println("perimeter"+ obj.perimeter());
	}

}
