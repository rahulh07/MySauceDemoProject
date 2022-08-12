package com.sauceDemo.TestPackage;

import java.io.IOException;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POM_LoginPage_class;
import com.sauceDemo.UtilityPackage.ScreenshotClass;

public class TC01VerifyLoginPage extends TestBaseClass
{
	
	
	@Test //(invocationCount = 5)	//invocationCount means run test multiple times
	public void verifylogin() throws IOException 
	{
				
		String expectedtitle = "Swag Labs";
		 
		String actualtitle = driver.getTitle();
		
		// Assertions/validations

		Assert.assertEquals(actualtitle, expectedtitle);
 
//		if (expectedtitle.equals(actualtitle))
//		{
//			System.out.println("Login Successful - Test Case Passed");
//			
//		} 
//		else 
//		{
//			System.out.println("Test Case Failed");
		}
	
				
}



