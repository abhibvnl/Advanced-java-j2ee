package com.jsp.jdbcProject.zomato;

import java.util.Scanner;

public class user {
 public static void main(String[] args) {
	
	 Scanner scan=new Scanner(System.in);
	 System.out.print("enter the type of food u want to order : ");
	 String food=scan.next();
	 zomato zf=foodFactory.getFood(food);
	
	 if(zf!=null) {
		 System.out.print("payment mode upi or cod : ");
		 String payMode=scan.next();
		 if(payMode.equalsIgnoreCase("upi")) {
			 zf.upi(500); 
			 zf.order(food);
		 }	
		 else if(payMode.equalsIgnoreCase("cod"))	{
			 zf.order(food);
			 zf.cod();
		 }
		
	 }
	
		
}
}
