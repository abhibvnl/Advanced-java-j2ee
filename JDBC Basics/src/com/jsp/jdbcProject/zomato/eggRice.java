package com.jsp.jdbcProject.zomato;

public class eggRice implements zomato {
    
	public void order(String food) {
		System.out.println(food + " ordered successFuly");	
	}
	
	public void upi( int money) {
		System.out.println("payment of " + money + " successs ");
		bank.amount=bank.amount-money;
		System.out.println(bank.amount);
	}
	
	public void cod() {
		System.out.println("order will reach u soon!....");
	}
}

