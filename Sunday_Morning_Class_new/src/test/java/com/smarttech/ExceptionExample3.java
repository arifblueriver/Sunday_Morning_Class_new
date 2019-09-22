package com.smarttech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionExample3 {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//driver = new ChromeDriver();// upcasting
		driver.get("https://www.google.com");
		
		
	}
	//java.lang
	//Runtime exception
	
}
