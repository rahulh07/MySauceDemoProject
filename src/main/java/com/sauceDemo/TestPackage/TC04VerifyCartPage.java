package com.sauceDemo.TestPackage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POM_CartPage_class;
import com.sauceDemo.POMPackage.POM_HomePage_class;
import com.sauceDemo.POMPackage.POM_LoginPage_class;

public class TC04VerifyCartPage extends TestBaseClass
{
	@Test
	public void verifycartpage() 
	{
		
		//home page
	
		POM_HomePage_class hp = new POM_HomePage_class(driver);

		hp.clickaddtocart();
		System.out.println("clicked on add to cart product");
		
		// validations
		
		String expcteditems = "1";
		String actualitems = hp.clickcartitems();
		
		Assert.assertEquals(actualitems, actualitems);
		
		//cart page
		
		POM_CartPage_class cp = new POM_CartPage_class(driver);
		
		cp.clickremovebutton();
		System.out.println("clicked on remove button");
		
		cp.clickcontshopping();
		System.out.println("clicked on continue shopping button");
		
		// home page
		
		hp.clickaddtocart();
		System.out.println("cart added");
		
		String expcteditems1 = "1";
		String actualitems1 = hp.clickcartitems();
		
		Assert.assertEquals(actualitems, actualitems1);
		
		hp.clickcartbutton();
		System.out.println("clicked on cart menu");
		
		//cart page
		
		cp.clickcheckout();
		System.out.println("cliked on checkout button");
		
		
		
		
	}
	

}
