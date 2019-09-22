package com.smart.generic.lib;

public  class  Login {

	public void getsalary() {
	System.out.println("Hi all");
}
	public static  String getmoney() {
		System.out.println("Hi all");
		
		return "Hi all";
	}
	public int  getIncome() {
		System.out.println("Have a nice day");
		
		return 5000;
	}
	
	public static void main(String[] args) {
		//calling other methods inside main
		Login obj = new Login();
		obj.getIncome();
		obj.getsalary();
		Login.getmoney();
	}
	
	
}