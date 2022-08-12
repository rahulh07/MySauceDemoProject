package com.sauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_BuyPage_class 
{
	private WebDriver driver;
	
//	@FindBy(xpath="//div[@class='cart_item_label']")
//	private WebElement productinfo;
//	
//	public void checkporductinfo()
//	{
//		productinfo.getText();
//		System.out.println(productinfo);
//	}
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelproduct;
	
	public void clickcancelproduct()
	{
		cancelproduct.click();
	}
	
	
	@FindBy(xpath="//div[text()='32.39']")
	private WebElement totalbill;
	
	public String texttotalbill()
	{
		String totalbillgenerate = totalbill.getText();
		return totalbillgenerate;
	}
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	public void clickfinish()
	{
		finish.click();
	}
	
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement ordered;
	
	public String itemordered()
	{
		String textordered = ordered.getText();
		return textordered;
	}
	
	
	
	public POM_BuyPage_class(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}
}