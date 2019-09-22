package com.smarttech;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {

	@FindBy(xpath = "(//*[@class='nav-line-1'])[3]")
	private WebElement signinBtn;
	
	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement sendmail;
	
	@FindBy(xpath = "//*[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id'signInSubmit']")
	private WebElement ClickOnSubmit;

	public WebElement getClickOnSubmit() {
		return ClickOnSubmit;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getSendmail() {
		return sendmail;
	}

	public WebElement getPassword() {
		return password;
	}
	

	
		
	
	}
	

