package com.smarttech;

public class TestingMehtods {

	void getsalary() {
		System.out.println("Hi all");
	}

	static void getmoney() {
		System.out.println("Have a nice day");

	}

	int getincome() {

		return 20;
	}

	public static void main(String[] args) {

		TestingMehtods object = new TestingMehtods();
		int a = object.getincome();
		System.out.println(a);
	}

}
