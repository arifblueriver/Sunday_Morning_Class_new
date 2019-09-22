package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		WebElement singinBtn=driver.findElement(By.xpath("(//*[@class='nav-line-1'])[3]"));
		singinBtn.click();
		
		WebElement email=driver.findElement(By.xpath("//*[@id='ap_email']"));
		email.sendKeys("studentttech@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@id='ap_password']"));
		password.sendKeys("student123");
		
		password.submit();///hit enter button
		
	}
}
