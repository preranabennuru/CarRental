package com.car.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBrandPage {
	WebDriver driver;
	
	@FindBy(id ="brand")
	private WebElement AdminBrandName;
	
	@FindBy(name  ="submit")
	private WebElement BrandSubmit;
	
	@FindBy(linkText = "Account")
	private WebElement Account;
	
	@FindBy(linkText = "Logout")
	private WebElement Logout;
	
	@FindBy(linkText = "Back to Home")
	private WebElement BackToHome;
	
	
	public CreateBrandPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getAdminBrandName() {
		return AdminBrandName;
	}

	public WebElement getBrandSubmit() {
		return BrandSubmit;
	}
	
	
	public WebElement getAccount() {
		return Account;
	}


	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getBackToHome() {
		return BackToHome;
	}

	public void AdminLogOut() {
		Actions action1=new Actions(driver);
		WebElement account=driver.findElement(By.linkText("Account"));
		action1.moveToElement(account).build().perform();
		Logout.click();

		BackToHome.click();
		
	}
	
	
}
