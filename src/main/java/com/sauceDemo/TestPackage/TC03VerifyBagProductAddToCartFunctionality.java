package com.sauceDemo.TestPackage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POM_HomePage_class;
import com.sauceDemo.POMPackage.POM_LoginPage_class;

public class TC03VerifyBagProductAddToCartFunctionality extends TestBaseClass
{
	
	
	@Test
	public void verifyaddtocart() 
	{
		//home page
		
		POM_HomePage_class hp = new POM_HomePage_class(driver);
		
		hp.clickaddtocart();
		System.out.println("product added to cart successfully");

		hp.clickfilter();
		System.out.println("filter selected");
		// validations // addto cart gettext
		
				
		hp.clickcartitems();
		hp.clickcartbutton();
		
		String expecteditem = "1";
		String actualitem = hp.clickcartitems();
		
		// Assertions
		
		Assert.assertEquals(actualitem, expecteditem);
		
		
//		if (expecteditem.equals(actualitem))
//		{
//			System.out.println("Product added successfully");
//			System.out.println("Test Case Passed");
//			
//		} 
//		else 
//		{ 
//			System.out.println("Test Case Failed");
//			
//		}
	}
	
		
				
}
