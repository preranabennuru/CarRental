package com.car.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.car.generic.webdriverUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility {
	WebDriver driver;
	//Declaration

	@FindBy(xpath = "//div[@class='login_btn']")
	private WebElement Login;
	
	@FindBy(name="email")
	private WebElement UserEmailTextfield;
	
	@FindBy(name="password")
	private WebElement PasswordTextfield;
	
	@FindBy(name="login")
	private WebElement LoginButton;
	
	//Create Constructor to Initialize
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Create Getters

	public WebElement getUserEmailTextfield() {
		return UserEmailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	public WebElement getLogin() {
		return Login;
	}
	//Call to login //Provide Action
	public void loginToApp(String USEREMAIL,String PASSWORD) {
		//Maximize Browser
		driver.manage().window().maximize();
		//Implicit Wait
		waitForPageToLoad(driver);
		//Navigate to the URL
		//driver.get(URL);
		
		Login.click();
		//Call UserEmailTextfield
		UserEmailTextfield.sendKeys(USEREMAIL);
		//Call PasswordTextfield
		PasswordTextfield.sendKeys(PASSWORD);
		//Call LoginButton
		LoginButton.click();
	}
	

}
