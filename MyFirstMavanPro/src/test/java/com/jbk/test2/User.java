package com.jbk.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class User {

	@Test
	public void testUserPage() {
		System.getProperty("webdriver.chromje.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[contains(@id,'password')]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[contains(@type,'sub')]")).click();
		driver.findElement(By.xpath("//*[text()='Users']")).click();
		driver.findElement(By.xpath("//*[text()='LOGOUT']")).click();
	}

}
