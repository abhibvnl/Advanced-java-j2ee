package com.jsp.jdbcProject.zomato;

import java.util.Scanner;

public class foodFactory {
   
	public static zomato getFood(String food) {
		
		Scanner scan=new Scanner(System.in);
		if(food.equalsIgnoreCase("biriyaani")) 
		return new biriyaani();	
		else if(food.equalsIgnoreCase("eggrice"))
	    return new eggRice();
		else
		System.out.println(food + " not available");
		return null;
	}
}
