package com.jsp.jdbcProject.zomato;

public class biriyaani implements zomato {
    
	public void order(String food) {
		System.out.println(food + " ordered successFully..");	
	}
	
	public void upi( int money) {
		System.out.println("Paying 238/-Rs from ur Bank account");
		System.out.println("payment of " + money + " successs ");
		bank.amount=bank.amount-money;
	}
	
	public void cod() {
		System.out.println("order will reach u soon!....");
	}
}

