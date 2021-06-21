//1)implementation logic
package com.jsp.jdbcProject.module1;

public class LedLight implements Iswitch {
	   
	    @Override
		public void on() {
			System.out.println("LED light turned on");
		}
		
	    @Override
		public void off() {
			System.out.println("LED light turned off");
		}
	}