package ScreenshotsFailed;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 extends BaseTest {

	@Test(testName="testGoogle")
	public void TestGoogleSearch()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Facebook");
		System.out.println(5/0);
		
	}
	
	@Test(testName="randomUSer")
	public void TestRandomName()
	{
		driver.get("https://randomuser.me/");
		String email=driver.findElement(By.xpath("//li[@data-title=\'Hi, My name is\']")).getText();
		System.out.println(email);
	}
	
}
