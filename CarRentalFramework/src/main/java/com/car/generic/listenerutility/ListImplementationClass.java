package com.car.generic.listenerutility;


import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListImplementationClass implements ITestListener , ISuiteListener {
	
	public static ExtentReports report;
	public ExtentSparkReporter spark;
	ExtentTest test;
    public WebDriver driver;

	@Override
	public void onStart(ISuite suite) {
 
		// Connect to DB
		// ExtentReport
		spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM Integration Result");
		spark.config().setReportName("CRM Report LeadToAll");
		spark.config().setTheme(Theme.DARK);
		
		// Add Env information and create test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "windows 11");
		report.setSystemInfo("BROWSER", "CHROME-100");
		

		ISuiteListener.super.onStart(suite);
	}

	@Override
	public void onFinish(ISuite suite) {
		
		report.flush();
		ISuiteListener.super.onFinish(suite);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		test = report.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		// Using object reference call getScreenshotAs and pass the argument (OutputType.BASE64)
		String filePath = ts.getScreenshotAs(OutputType.BASE64);
		//Use Time Stamp to save multiple screenshots
		String time = new Date().toString().replace(" ","").replace(";", "");
		
		test.addScreenCaptureFromBase64String(filePath, testName+"_"+time);
		
		
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
}
