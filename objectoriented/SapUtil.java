package com.sapient.util;

public class SapUtil {
	
	public static double roundUp2Dec(double val){
		val=val*100;
		return Math.round(val)/100.0;
		
	}

}
