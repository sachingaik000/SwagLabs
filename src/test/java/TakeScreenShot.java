import java.awt.AWTException;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {

    WebDriver driver;

    public TakeScreenShot(WebDriver driver) {

        this.driver=driver;

    }

     public void CaptureScreenshot(String screenshotName) throws AWTException
        {


                    try {
                                TakesScreenshot ts=(TakesScreenshot)driver;
                                File source=ts.getScreenshotAs(OutputType.FILE);
                                FileUtils.copyFile(source, new File("C:\\Users\\Documents\\Eclipse\\WorkSpace\\ScreenShot\\"+screenshotName));

                                System.out.println("Screenshot taken");


                    } catch (Exception e) {

                                System.out.println("Exception "+e.getMessage());

                    }            
        }
}