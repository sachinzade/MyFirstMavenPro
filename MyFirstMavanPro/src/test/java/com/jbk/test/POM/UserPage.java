package com.jbk.test.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserPage {
	
	WebDriver updriver;
	
	public UserPage(WebDriver driver) 
	{
		this.updriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(xpath= "/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[2]/div/input")
	WebElement mobile;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(xpath="//*[contains(@id, 'course')]")
	WebElement course;
	
	@FindBy(xpath="//*[contains(@id, 'Male')]")
	WebElement gender;
	
	@FindBy(xpath= "//select[contains(@class, 'form-control')]")
	WebElement state;
	
	@FindBy(xpath="//*[contains(@id, 'password')]")
	WebElement passWord;
	
	@FindBy(xpath="//*[contains(@placeholder, 'FriendM')]")
	WebElement friendMobile;
	
	@FindBy(xpath="//*[contains(@id, 'submit')]")
	WebElement submit;
	
	public void clickAddBtn()
	{
		username.sendKeys("Sachin Zade");
		mobile.sendKeys("9405779493");
		email.sendKeys("szade50@gmail.com");
		course.sendKeys("OJT Selenium");
		gender.click();
		Select s1 = new Select(state);
		s1.selectByVisibleText("Maharashtra");
		passWord.sendKeys("123456");
		friendMobile.sendKeys("1122334455");
		submit.click();
		
	}
	
}
