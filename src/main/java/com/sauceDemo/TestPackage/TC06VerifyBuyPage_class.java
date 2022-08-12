package com.sauceDemo.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POM_BuyPage_class;
import com.sauceDemo.POMPackage.POM_CartPage_class;
import com.sauceDemo.POMPackage.POM_CheckoutPage_class;
import com.sauceDemo.POMPackage.POM_HomePage_class;
import com.sauceDemo.POMPackage.POM_LoginPage_class;

public class TC06VerifyBuyPage_class extends TestBaseClass
{
	
	@Test
	public void verifybuypage() 
	{
		// home page
		
		POM_HomePage_class hp = new POM_HomePage_class(driver);
		
		hp.clickaddtocart();
		System.out.println("product added to cart successfully");

		hp.clickcartbutton();
		System.out.println("cart button clicked successfully");
		
		// cart page
		POM_CartPage_class cp = new POM_CartPage_class(driver);
		
		cp.clickcheckout();
		System.out.println("cliked on checkout button");
		
		// check out page
		
		POM_CheckoutPage_class checkout = new POM_CheckoutPage_class(driver);
		
		checkout.enterfname();
		System.out.println("first name entered");
		
		checkout.enterlname();
		System.out.println("last name entered");
		
		checkout.enterpcode();
		System.out.println("pin code entered");
		
		checkout.clickcontinuebutton();
		System.out.println("clicked on contine");
		
		// buy page
		
		POM_BuyPage_class bp = new POM_BuyPage_class(driver);
		
		//bp.checkporductinfo();
		
		bp.clickcancelproduct();
		System.out.println("product cancelled");
		
		//home page
		
		hp.clickaddtocart();
		System.out.println("product added to cart successfully");

		hp.clickcartbutton();
		System.out.println("cart button clicked successfully");

		//cart page
		
		cp.clickcheckout();
		System.out.println("cliked on checkout button");

		// check out page
		
		checkout.enterfname();
		System.out.println("first name entered");

		checkout.enterlname();
		System.out.println("last name entered");

		checkout.enterpcode();
		System.out.println("pin code entered");

		checkout.clickcontinuebutton();
		System.out.println("clicked on contine");

		
		bp.clickfinish();
		System.out.println("Product Ordered Successfully");
		// buy page
		
		String expctedbill = "THANK YOU FOR YOUR ORDER";
		
		String actualbill = bp.itemordered();
		
		// Assertions
		Assert.assertEquals(expctedbill, actualbill);

		
	}

		
	}


