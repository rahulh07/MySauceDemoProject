package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMPackage.POM_LoginPage_class;
import com.sauceDemo.UtilityPackage.ScreenshotClass;

public class TestBaseClass 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");
			//1. open browser
			//2. open URL
			//3. Login operations
			//4. validations (test case - passed/failed)
			//5. close browser
		
		driver = new ChromeDriver();
		}
		else
		{
		System.setProperty("webdriver.gecko.driver", 
				"./DriverFolder/geckodriver.exe");
			//1. open browser
			//2. open URL
			//3. Login operations
			//4. validations (test case - passed/failed)
			//5. close browser
		
		driver = new FirefoxDriver();
		}
		
		System.out.println("Browser Opened Successfully");

		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Opened Successfully");

		ScreenshotClass.takesscreenshot(driver);
		System.out.println("ScreenShot Captured");
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximized Successfully");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//login page
		
		POM_LoginPage_class loginpage = new POM_LoginPage_class(driver);
		loginpage.sendusername();
		System.out.println("Username entered");
		
		loginpage.sendpassword();
		System.out.println("Password entered");
		
		loginpage.clicklogin();
		System.out.println("Login button clicked");
		
		ScreenshotClass.takesscreenshot(driver);

	}


	@AfterMethod

	public void tearDown()
	{
		driver.quit();
		System.out.println("browser closed");
	}
				
	}
