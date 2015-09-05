package com.mybank.accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

		String sHomeTitle = "Personal Banking, Online Banking Services - ICICI Bank";
		System.out.println(driver.getTitle());
		Assert.assertTrue(sHomeTitle.equals(driver.getTitle())); 	
		
		driver.findElement(By.linkText("NRI")).click();
		String sNRITitle = "NRI Banking - NRI Bank Account - NRI Services";		
		System.out.println(driver.getTitle());
		Assert.assertTrue(sNRITitle.equals(driver.getTitle()), "You have not in the NRI page");		
		
		driver.quit();
	}

}
