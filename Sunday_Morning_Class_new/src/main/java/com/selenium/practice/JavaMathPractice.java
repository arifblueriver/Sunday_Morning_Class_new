package com.selenium.practice;

public class JavaMathPractice {
	static int a ;
	static int b ;
	static int c;

	void addValue(int x,int y) {
		this.a=x;
		this.b=y;
		c = a + b;
		System.out.println("Add value::"+c);
	}

	static void minusValue(int x,int y) {
		
		c=y-x;
		System.out.println("Minus Value::"+c);

	}

	static int divisionValue(int x,int y) {
		
		c=y/x;
		System.out.println("Division Value::"+c);

		return 10;
	}

	int multiply(int x,int y) {
		this.a=x;
		this.b=y;
		c=b*a;
		System.out.println("Multiplication Value::"+c);

		return 20;
	}

	

}
