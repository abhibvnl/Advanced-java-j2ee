//2)object creation logic
//LightFactory : helper class bcoz it contain helper class 
package com.jsp.jdbcProject.module1;

public class LightFactory {
     
  public static	Iswitch getLight (String type){  //helper/factory  method
		 
	  if(type.equalsIgnoreCase("TubeLight")) {
		  System.out.println("tublight Obj is Created");
		  return new TubeLight();
	  }
	  
	  else if(type.equalsIgnoreCase("LedLight"))
	  {
		  System.out.println("Led light Obj is Created");
		  return new LedLight();
	  }
	  
	  else {
		  System.out.println("No device found");
		  return null;
	  }
		 
	 }
	
}
