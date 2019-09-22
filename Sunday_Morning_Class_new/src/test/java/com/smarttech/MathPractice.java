package com.smarttech;

public  class MathPractice {
	
	
	 int a=10;
	int b=20;
	
	 int getSum(){
	
		int c=a+b;
		
	return c;	
	}
	
	public static void main(String[] args) {
		//how to call getSum()
		
		MathPractice object = new MathPractice();
		
		//System.out.println(object.getSum());
		
		int g =object.getSum();
		System.out.println(g);
	}

}
