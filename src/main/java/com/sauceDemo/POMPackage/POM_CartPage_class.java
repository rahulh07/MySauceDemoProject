package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_CartPage_class 
{
	private WebDriver driver;
	
	@FindBy(xpath="//div[@class='cart_quantity']")
	private WebElement productcount;
	
	public void getproductcount()
	{
		productcount.getText();
	}
	
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement removebutton;
	
	public void clickremovebutton()
	{
		removebutton.click();
	}
	
	@FindBy(xpath="//button[@name ='continue-shopping']")
	private WebElement continueshopping;
	
	public void clickcontshopping()
	{
		continueshopping.click();
	}

	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkoutbutton;
	
	public void clickcheckout()
	{
		checkoutbutton.click();
		
	}
	
	public POM_CartPage_class(WebDriver driver)
	
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
}
