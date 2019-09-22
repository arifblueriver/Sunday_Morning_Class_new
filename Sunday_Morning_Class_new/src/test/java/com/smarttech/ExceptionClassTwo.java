package com.smarttech;

public class ExceptionClassTwo {

	public static void main(String[] args) throws Exception  {
		
		int [] a = {10,20,30};//why red?
		
		System.out.println(a[5]);
		
	}
	
	//java.lang
	// RunTime exception >>> Uncheked ====> ArrayindexOutOfBound
	
}
