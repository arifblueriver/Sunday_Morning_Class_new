package com.smarttech;

public class CompileTimeException1 {
	
	public void getsalary() {//problem
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// problem
		System.out.println("Hi all");
	}
	
	
	
	public static void main(String[] args)  {
		
		CompileTimeException1 obj = new CompileTimeException1();
		obj.getsalary() ;
	
	}

}

//How to solve compilation ? throws , try catch
//Runtime == try catch
















//red >>>> .java to .class===> compilation error/problem=======> compiletime exception

// java.lang 
//error == your code mistake or system error

// Compiletime exception===>
/*
 * InterruptedException ClassNotFoundException SQLException
 * FileNotFoundException IOException
 */
/*
 * Run time exception /Unchecked ==> Arithmatic exception, ArrayindexOutOfBound
 * nullpointerexcetion
 */
