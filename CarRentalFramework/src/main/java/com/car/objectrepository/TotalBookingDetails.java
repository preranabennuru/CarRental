package com.car.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotalBookingDetails {
	WebDriver driver;
	
	@FindBy(linkText = "Confirm")
	private WebElement Confirm;
	
	@FindBy(linkText = "Cancel")
	private WebElement  Cancel;
	
	public TotalBookingDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getConfirm() {
		return Confirm;
	}

	public WebElement getCancel() {
		return Cancel;
	}
	
	
	


}
