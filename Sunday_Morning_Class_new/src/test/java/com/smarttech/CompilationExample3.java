package com.smarttech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class CompilationExample3 {

	public static void main(String[] args) throws Throwable {
		
		
		FileInputStream file= new FileInputStream("location");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		int RowCount= sheet.getPhysicalNumberOfRows();

	}

}

// FileNotFoundException
//IOException






