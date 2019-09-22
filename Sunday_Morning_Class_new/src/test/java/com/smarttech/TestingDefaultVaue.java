package com.smarttech;

public class TestingDefaultVaue {
	
	static int a;
	static double b;
	static String c;
	static String e="sarower";
	static boolean d;
	
public static void main(String[] args) {
	
	try{
		System.out.println(2/0);
	}catch(Exception e){
		
	}
	
	
	try {
		System.out.println(c.concat("Ahmmed"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	System.out.println("Hi all");
	System.out.println("Have a nice day");
}
	

}
