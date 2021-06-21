//3)consumer or utilization class
package com.jsp.jdbcProject.module1;

import java.util.Scanner;

public class User {
   public static void main(String[] args) {
	
	   Scanner scan =new Scanner(System.in);
	   System.out.println("Enter type of light u want to operate");
	   String choice=scan.next();
	   
	   //upcasting
	   Iswitch light = LightFactory.getLight(choice); 
	   
	   if(light!=null) {
		   
		   System.out.print("do u want light to be turn on or off : ");
		   choice=scan.next();
		   if(choice.equalsIgnoreCase("on"))
		   light.on();
		   else if(choice.equalsIgnoreCase("off"))
		   light.off(); 
		   else
		   System.out.println("invalid choice");
	   }
	  
}
}
