import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAttribute {
	
	@Test(invocationCount=3, invocationTimeOut=10000)
	public void testmethod1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
		
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		
		System.out.println("User Name: "+driver.findElement(By.id("user_value")));
		
	}

}
