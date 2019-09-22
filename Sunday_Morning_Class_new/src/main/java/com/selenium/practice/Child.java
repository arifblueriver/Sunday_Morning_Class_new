package com.selenium.practice;

public class Child extends Parent{
	
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.getsalary();
		obj.getsalary(10);
		
	}

	@Override
	void getsalary() {
		
		
	}

}
