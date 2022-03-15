package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.test.POM.UserPage;

public class DashboardPage {
	WebDriver dpdriver;
	
	public DashboardPage(WebDriver driver) 
	{
		this.dpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/section[1]/h1")
	WebElement header;
	
	@FindBy(xpath="//span[text()='Users']")
	WebElement user;
	
	@FindBy(xpath="//*[text()='Add User']")
	WebElement addUseBtn;
	
	public boolean verifyHeader()
	{
		return header.isDisplayed();
	}
	
	public UserPage clickUserBtn()
	{
		 user.click();
		 addUseBtn.click();
		 return new UserPage(dpdriver);
	}
	
}
