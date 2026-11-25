package com.car.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	
	@FindBy(linkText ="Brands")
	private WebElement AdminBrand;
	
	@FindBy(xpath ="//a[text()='Create Brand']")
	private WebElement CreateBrand;
	
	@FindBy(xpath ="//a[text()='Manage Brands']")
	private WebElement ManageBrand;
	
	
	@FindBy(linkText ="Vehicles")
	private WebElement AdminVehicles;
	
	@FindBy(linkText ="Bookings")
	private WebElement AdminBookings;
	
	@FindBy(linkText ="Reg Users")
	private WebElement AdminRegUsers;
	
	@FindBy(linkText ="Manage Pages")
	private WebElement AdminManagePages;
	
	@FindBy(linkText ="Update Contact Info")
	private WebElement AdminUpdateInfo;
	
	@FindBy(linkText ="Manage Subscribers")
	private WebElement AdminManageSubscribers;
	
	@FindBy(css = "a[href='manage-bookings.php']")
	private WebElement BookingDetails;
	
	@FindBy(xpath = "//div[text()='Subscibers']/ancestor::div[@class='panel panel-default']/descendant::a[@class='block-anchor panel-footer']")
	private WebElement SubscribersDetails;
	
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getAdminBrand() {
		return AdminBrand;
	}

	public WebElement getCreateBrand() {
		return CreateBrand;
	}
	

	public WebElement getManageBrand() {
		return ManageBrand;
	}

	public WebElement getAdminVehicles() {
		return AdminVehicles;
	}

	public WebElement getAdminBookings() {
		return AdminBookings;
	}

	public WebElement getAdminRegUsers() {
		return AdminRegUsers;
	}

	public WebElement getAdminManagePages() {
		return AdminManagePages;
	}

	public WebElement getAdminUpdateInfo() {
		return AdminUpdateInfo;
	}

	public WebElement getAdminManageSubscribers() {
		return AdminManageSubscribers;
	}

	public WebElement getBookingDetails() {
		return BookingDetails;
	}

	public WebElement getSubscribersDetails() {
		return SubscribersDetails;
	}
	
	
	

}
