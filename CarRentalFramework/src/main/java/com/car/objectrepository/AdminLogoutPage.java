package com.car.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogoutPage {
	WebDriver driver;
	
	@FindBy(linkText="Logout")
	private WebElement AdminLogout;
	
	public AdminLogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getAdminLogout() {
		return AdminLogout;
	}
	
	

}
