package com.sapient.client;

import com.sapient.services.SalesPerson;

public class SalesPersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SalesPerson s1=new SalesPerson(1001,45000,"ram");
         SalesPerson s2=new SalesPerson(1001,18000,"tom");
         SalesPerson s3=new SalesPerson(1001,10000,"sam");
         s1.display();
         s2.display();
         s3.display();
         System.out.println();
         System.out.println();
        		 
	}

}
