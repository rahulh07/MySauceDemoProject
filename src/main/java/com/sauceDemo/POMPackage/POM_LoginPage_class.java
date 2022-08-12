package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LoginPage_class 
{
	//1.	declare webdriver
	//2.	find elements
	//3.	action on elements - create method
	//4.	create constructor
	
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordname;
	
	
	public void sendpassword()
	{
		passwordname.sendKeys("secret_sauce");
	}
	
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbutton;
	
	public void clicklogin()
	{
		//loginbutton.click();
		//or
		act.click(loginbutton).perform();
	}
	
	
	public POM_LoginPage_class(WebDriver driver)
	{
		this.driver = driver;				//matched local and global variable
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	

}
