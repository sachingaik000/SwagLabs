import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenNormal {
	public static void main(String [] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
		
		driver.findElement(By.xpath("//li[@data-title='My email address is']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshot/Image11.png"));
		/*
		String base24=ts.getScreenshotAs(OutputType.BASE64);
		byte[] bytearr =Base64.getDecoder().decode(base24);
		
		FileOutputStream fos=new FileOutputStream(new File("./Screenshot/Image2.png"));
		fos.write(bytearr);
			*/	
		driver.quit();
		
		
		
	}

}
