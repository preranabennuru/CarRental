package com.car.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.car.generic.webdriverUtility.WebDriverUtility;

public class AdminLoginPage {
	WebDriver driver;
	
	@FindBy(name="username")
	private WebElement AdminName;
	
	@FindBy(name="password")
	private WebElement AdminPassword;
	
	@FindBy(name="login")
	private WebElement AdminLogin;
	
	@FindBy(linkText = "Back to Home")
	private WebElement BackToHome;
	
	//Create Constructor to Initialize
		public AdminLoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

		//GetterMethods
		public WebElement getAdminName() {
			return AdminName;
		}

		public WebElement getAdminPassword() {
			return AdminPassword;
		}

		public WebElement getAdminLogin() {
			return AdminLogin;
		}
		

		public WebElement getBackToHome() {
			return BackToHome;
		}

		//Call to login //Provide Action
		public void loginAsAdmin(String USERNAME,String PASSWORD) {
			//Maximize Browser
			driver.manage().window().maximize();
		
			AdminName.sendKeys(USERNAME);
			//Call PasswordTextfield
			AdminPassword.sendKeys(PASSWORD);
			//Call LoginButton
			AdminLogin.click();
		}
}
