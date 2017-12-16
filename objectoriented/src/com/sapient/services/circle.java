package com.sapient.services;

public class circle {

      public double radius;
      
      public double area(){
    	  double area= Math.pow(radius, 2)*Math.PI;
    	  return area;
      }
      
      public double perimeter(){
    	  double peri= 2*Math.PI*radius;
          return peri;
      }

	}


