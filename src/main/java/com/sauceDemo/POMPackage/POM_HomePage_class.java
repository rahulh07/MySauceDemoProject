package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_HomePage_class 
{
		//1.	declare webdriver
		//2.	find elements
		//3.	action on elements - create method
		//4.	create constructor
	
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	public void clickMenuButton()
	{
		menubutton.click();
	}
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutbutton;
	
	public void clickLogoutButton() 
	{
		logoutbutton.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addtocart;
	
	public void clickaddtocart() 
	{ 
		addtocart.click();		
	}
	
	@FindBy(xpath="//span[text()='1']")
	private WebElement cartitems;
	
	public String clickcartitems()
	{
		String totalproducts = cartitems.getText();
		return totalproducts;
	}
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartbutton;
	
	public void clickcartbutton()
	{		
		cartbutton.click();
	}
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	
	public void clickfilter()
	{
		filter.click();
		
		s.selectByVisibleText("Price (high to low)");
	}
			
	
	public POM_HomePage_class(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		s = new Select(filter);
	}

}
