package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	WebDriver lpdriver;
	
	public LoginPage(WebDriver driver) 
	{
		this.lpdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button")
	private WebElement loinButn;
	
	@FindBy(xpath="//*[text()='Register a new membership']")
	private WebElement register;
	
	public RegistrationPage signIntoPage1()
	{
		register.click();
		return new RegistrationPage(lpdriver);
	}
	
	public void loginToApplication(String uname , String pass)
	{
		userName.sendKeys(uname);
		password.sendKeys(pass);
		loinButn.click();
	}
	
	public DashboardPage validLogin()
	{
		userName.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loinButn.click();
		return new DashboardPage(lpdriver);
		
	}	

}
