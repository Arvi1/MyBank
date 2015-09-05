package com.mybank.accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccount {
	WebDriver driver;
	
	@Test
	public void HomePage(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.icicibank.com/");

		String sTitle = "Personal Banking, Online Banking Services - ICICI Bank";
		System.out.println(driver.getTitle());
		Assert.assertTrue(sTitle.equals(driver.getTitle())); 	
		
		driver.quit();
	}

}
