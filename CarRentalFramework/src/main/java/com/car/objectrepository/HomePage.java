package com.car.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	
	@FindBy(xpath ="//a[text()='About Us']")
	private WebElement AboutUS;
	
	@FindBy(xpath="//a[text()='Car Listing']")
	private WebElement CarListing;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement ContactUs;
	
	@FindBy(xpath="//a[@href=\"admin/\"]")
	private WebElement AdminLoginLink;
	
	@FindBy(xpath="//input[@name='subscriberemail']")
	private WebElement Subscribe;
	
	@FindBy(name="emailsubscibe")
	private WebElement EmailSubscribe;
	
	
	
	@FindBy(xpath = "//a[text()='Login / Register']")
	private WebElement LoginOrRegister;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getAboutUS() {
		return AboutUS;	
	}
	public WebElement getCarListing() {
		return CarListing;
	}
	public WebElement getContactUs() {
		return ContactUs;
	}
	public WebElement getAdminLoginLink() {
		return AdminLoginLink;
	}
	public WebElement getSubscribe() {
		return Subscribe;
	}
	public WebElement getLoginOrRegister() {
		return LoginOrRegister;
	}
	
	
	
	public WebElement getEmailSubscribe() {
		return EmailSubscribe;
	}
	public void subscribeemail(String USEREMAIL) {
		//Maximize Browser
		driver.manage().window().maximize();
	
		Subscribe.sendKeys(USEREMAIL);

	}

	

	
}
