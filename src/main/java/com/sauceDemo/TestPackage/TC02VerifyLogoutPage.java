package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POM_HomePage_class;
import com.sauceDemo.POMPackage.POM_LoginPage_class;
import com.sauceDemo.UtilityPackage.ScreenshotClass;

public class TC02VerifyLogoutPage extends TestBaseClass
{
	
		@Test
	public void verifylogout() 
	{
		
		//homepage
		
		POM_HomePage_class hp = new POM_HomePage_class(driver);
		
		hp.clickMenuButton();
		System.out.println("Menu Button Clicked successfully");
		
		hp.clickLogoutButton();
		System.out.println("Logout done successfully");
		
		//return to loginPage
		
		String expectedtitile = "Swag Labs";
		String actualtitle = driver.getTitle();
		
		// Assertions
		Assert.assertEquals(expectedtitile, actualtitle);
		
//		if (expectedtitile.equals(actualtitle)) 
//		{
//			System.out.println("Test Case Passed");
//			
//		} 
//		else 
//		{
//			System.out.println("Test Case Failed");
//		}
	}		

	

}
