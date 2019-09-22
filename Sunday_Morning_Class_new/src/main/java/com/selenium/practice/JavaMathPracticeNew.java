package com.selenium.practice;

public class JavaMathPracticeNew {
	static int a;
	static int b;
	static int c;

	JavaMathPracticeNew(int x, int y) {// constractor >>> special method

		this.a = x;
		this.b = y;
	}

	void addValue() {

		c = a + b;
		System.out.println("Add value::" + c);
	}

	static void minusValue() {

		c = b - a;
		System.out.println("Minus Value::" + c);

	}

	static int divisionValue() {

		c = b / a;
		System.out.println("Division Value::" + c);

		return 10;
	}

	int multiply() {

		c = b * a;
		System.out.println("Multiplication Value::" + c);

		return 20;
	}

}
