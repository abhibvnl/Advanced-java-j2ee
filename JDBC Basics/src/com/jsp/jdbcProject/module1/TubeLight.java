////1)implementation logic
package com.jsp.jdbcProject.module1;

public class TubeLight implements Iswitch {
   
	@Override
	public void on() {
		System.out.println("Tublight turned on");
	}
	
	@Override
	public void off() {
		System.out.println("Tublight turned off");
	}
}
