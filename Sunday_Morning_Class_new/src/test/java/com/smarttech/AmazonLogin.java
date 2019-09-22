package com.smarttech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
    static WebDriver driver;
	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize(); //
		driver.get("https://www.amazon.com/");
     
		MasterPageFactory pf = PageFactory.initElements(driver,MasterPageFactory.class);
		pf.getSigninBtn().click();
		
		pf.getSendmail().sendKeys("studentttech@gmail.com");
		
		pf.getPassword().sendKeys("student123");
		
		pf.getPassword().submit();
		
		pf.getClickOnSubmit().click();
		
		
		
		
	}

}
