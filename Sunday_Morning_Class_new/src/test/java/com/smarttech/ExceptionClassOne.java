package com.smarttech;

public class ExceptionClassOne {


	public static void main(String[] args) {
		
		
			try {
				System.out.println(12/0);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			
			System.out.println("Hi all");
			
	}
	
}

//Run time not possible to handle ... try catch

