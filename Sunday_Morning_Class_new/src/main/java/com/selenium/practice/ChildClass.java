package com.selenium.practice;

public class ChildClass extends ParentClass {
	
	public static void main(String[] args) {
		ParentClass obj = new ChildClass();
		obj.getmoney();
		obj.getsalary();
		//obj.getincome();// against java rules
		ParentClass.getincome();
		
		
		
		
}

	@Override
	void getBody() {
		
		
	}
}