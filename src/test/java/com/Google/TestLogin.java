package com.Google;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	
	//@Test(dataProvider = "loginData", dataProviderClass = DataSupplier.class)
	@Test(dataProvider = "loginData")
	public void Test1(String user,String pass)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
		
	}
	@DataProvider(parallel=true)
	public Object[][] loginData()
	{
		Object[][] data=new Object[6][2];
		
		data[0][0]="sachin9850032875@gmail.com";
		data[0][1]="sach5543";
		
		data[1][0]="abc@gmail.com";
		data[1][1]="sach5543";
		
		data[2][0]="pqr@gmail.com";
		data[2][1]="sach5543";
		
		data[3][0]="xyz@gmail.com";
		data[3][1]="sach5543";
		
		data[4][0]="def@gmail.com";
		data[4][1]="sach5543";
		
		data[5][0]="jki@gmail.com";
		data[5][1]="sach5543";
		
		return data;
	}

}
