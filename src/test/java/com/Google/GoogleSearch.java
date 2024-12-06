package com.Google;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import com.DataProvider.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("WebDriver.chrome.Driver", "C:/Sachin/chrome-win64");
		driver=new ChromeDriver();
		driver.get("https:\\WWW.facebook.com");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	
	@Test
	public void firstMethod(String user,String pass)
	{
		System.out.println("Hello");
	
	}
	
	@Test
	public void secondMethod()
	{
		System.out.println("This is second test method");
	}
	

}
