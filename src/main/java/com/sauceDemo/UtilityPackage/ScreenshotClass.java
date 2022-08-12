package com.sauceDemo.UtilityPackage;

import java.io.File;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
	public static void takesscreenshot(WebDriver driver) throws IOException 
	{
		Format Dateformat = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
		String date = Dateformat.format(new Date());
		
		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//File path = new File("C:\\Users\\Hedau Rahul\\Desktop\\Selenium Screenshots\\SauceDemo "+ date + ".jpg");

		File path = new File("./Screenshotfolder/SauceDemo "+ date + ".jpg");

		FileHandler.copy(ss, path);
		
	}

}
