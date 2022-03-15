package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver rgdriver;
	public RegistrationPage(WebDriver driver) 
	{
		this.rgdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(@name,'name')]")
	WebElement name;
	
	@FindBy(xpath="//*[contains(@name,'mobile')]")
	WebElement mobile;
	
	@FindBy(xpath="//*[contains(@name,'email')]")
	WebElement email;
	
	@FindBy(xpath="//*[contains(@type,'password')]")
	WebElement password;
	
	@FindBy(xpath="//*[contains(@type,'sub')]")
	WebElement signIn;
	
	public void newRegister()
	{
		name.sendKeys("Sachin Zade");
		mobile.sendKeys("9405779493");
		email.sendKeys("szade50@gmail.com");
		password.sendKeys("123456");
		signIn.click();
		
	}
}
