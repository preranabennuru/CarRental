package com.carbookin.BaseTest;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.beust.jcommander.Parameter;
import com.car.generic.fileUtility.ExcelUtility;
import com.car.generic.fileUtility.FileUtility;
import com.car.generic.webdriverUtility.WebDriverUtility;
import com.car.objectrepository.AdminLoginPage;
import com.car.objectrepository.LoginPage;

public class BaseClass {
	//Create Object
	//public DataBaseUtility dLib=new DataBaseUtility();
	public WebDriver driver=null;
	public FileUtility futil=new FileUtility();
	public WebDriverUtility wutil =new WebDriverUtility();
	public ExcelUtility eutil=new ExcelUtility();
	public FileUtility jutil=new FileUtility();
	//public ExtentSparkReporter spark;
	public ExtentReports report;
	
	@BeforeSuite(alwaysRun = true)
	//Db Connection
	public void configBS()throws SQLException{
		System.out.println("===Connect to DB,Report Config===");
		//dLib.getDbconnection();*/
	//Extent Report
	//Configuration of the report
	ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
	spark.config().setDocumentTitle("CRM Test Suite Results");
	spark.config().setReportName("CRM Report");
	spark.config().setTheme(Theme.DARK);
	
	//add Env information & create test
	report=new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("OS","Windows-10" );
	report.setSystemInfo("BROWSER","CHROME-100" );
}



	@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	//Launching Browser
	//public void ConfigBC() throws IOException {
		//For crossBrowser Execution
	public void ConfigBC(@Optional("chrome")String BROWSER) throws IOException {
		//Comment this when you want to perform CrossBrowser Execution
		//String BROWSER=futil.getDataFromPropertiesFile("browser");
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}else {
			driver=new ChromeDriver();
		}
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void ConfigBM() throws IOException {
	//Login
	String URL=futil.getDataFromPropertiesFile("url");
	driver.get(URL);
	/*String USERMAIL=futil.getDataFromPropertiesFile("usermail");
	String PASSWORD=futil.getDataFromPropertiesFile("password");
	
	LoginPage lp=new LoginPage(driver);
	lp.loginToApp(URL,USERMAIL,PASSWORD);
	//Alert ale=driver.switchTo().alert();
	//ale.accept();*/
	}
//	@BeforeMethod
//	public void ConfigBMForAdmin() throws IOException {
//		//AdminLogin
//	
//		String USERNAME=futil.getDataFromPropertiesFileForAdmin("username");
//		String PASSWORD=futil.getDataFromPropertiesFileForAdmin("password");
//		
//	/	AdminLoginPage alp=new AdminLoginPage(driver);
//		alp.loginAsAdmin(USERNAME,PASSWORD);
//	}
		
	
	@AfterMethod(alwaysRun = true)
	//Logout
	public void ConfigAM() {
		
	}
	
	@AfterClass(alwaysRun = true)
	//Quit the browser
public void ConfigAC() {
		
	}
	
	@AfterSuite(alwaysRun = true)
	//Close the Db Connection

public void ConfigAS() {
		
	}
	
}
