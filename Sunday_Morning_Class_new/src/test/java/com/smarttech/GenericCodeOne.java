package com.smarttech;

public class GenericCodeOne {
	
	 int a;
	 int b;
	 int c;
	 GenericCodeOne(int a,int b){
		 this.a=a;
		 this.b=b; 
		 
	 }
	
	void getsalary(){
		
		System.out.println("this is a value::"+a);
		
		System.out.println("this is b::"+b);
	}

	 int getmoney(){
		
		 
		c=a+b;
		//System.out.println(c);
		return c;
	}
}
