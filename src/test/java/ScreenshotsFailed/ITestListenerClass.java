package ScreenshotsFailed;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {

		try {
			captureScreenShot(result.getMethod().getMethodName()+".jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
