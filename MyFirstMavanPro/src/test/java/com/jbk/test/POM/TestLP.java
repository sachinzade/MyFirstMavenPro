package com.jbk.test.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.DashboardPage;
import com.jbk.LoginPage;
import com.jbk.RegistrationPage;

public class TestLP 
{
	WebDriver driver = null;
	@Test
	public void loginTest()
	{
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/SELENIUM%20+%20TESTING/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		LoginPage lp = new LoginPage(driver);
		
		DashboardPage dp = lp.validLogin();
		UserPage up = dp.clickUserBtn();
		up.clickAddBtn();
		String alert = driver.switchTo().alert().getText();
		String actRsl = alert;
		driver.switchTo().alert().accept();
		String expRsl = "User Added Successfully. You can not see added user.";
		Assert.assertEquals(actRsl, expRsl);
		driver.close();
		
	}//logintest ends 	
		@Test
		public void TestRegister()
		{
			System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///D:/SELENIUM%20+%20TESTING/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
			LoginPage lp = new LoginPage(driver);
			RegistrationPage rp = lp.signIntoPage1();
			rp.newRegister();
			String alert = driver.switchTo().alert().getText();
			String actRsl = alert;
			driver.switchTo().alert().accept();
			String expRsl = "User registered successfully.";
			Assert.assertEquals(actRsl, expRsl);
			driver.close();
	}// TestRegister ends
}
