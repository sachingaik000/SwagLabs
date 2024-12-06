package com.hyr.Reports;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class chapter1 {
	public static void main(String[] args)
	{
		ExtentReports extentReports=new ExtentReports();
		File file=new File("Report.html");
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		
		extentReports.attachReporter(sparkReporter);
		
		ExtentTest test1=extentReports.createTest("Test1");
		test1.pass("This is passed");
		
		extentReports.flush();
				
		
	}
	

}
