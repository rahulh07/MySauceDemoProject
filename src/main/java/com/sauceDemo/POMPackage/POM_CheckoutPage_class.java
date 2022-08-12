package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_CheckoutPage_class 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement fname;
	
	public void enterfname()
	{
		fname.sendKeys("mark");
	}
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lname;
	
	public void enterlname() 
	{
		lname.sendKeys("johnson");		
	}
	
	@FindBy(xpath="//input[@placeholder='Zip/Postal Code']")
	private WebElement pcode;
	
	public void enterpcode()
	{
		pcode.sendKeys("070707");
	}
	
//	@FindBy(xpath="//button[@id='cancel']")
//	private WebElement cancelbutton;
//	
//	public void clickcancelbutton()
//	{
//		cancelbutton.click();

		
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	
	public void clickcontinuebutton() 
	{
		continuebutton.click();
	}
	
	
	public POM_CheckoutPage_class(WebDriver driver)
	
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
		
	}

}
