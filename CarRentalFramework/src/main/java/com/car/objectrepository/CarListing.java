package com.car.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarListing {
	WebDriver driver;
	
	@FindBy(xpath="//select[@name='brand']")
	private WebElement Brand;
	
	@FindBy(xpath="//select[@name='fueltype']")
	private WebElement FuelType;
	
	@FindBy(xpath="//option[@value='2']")
	private WebElement CarBrand;
	
	@FindBy(xpath="//option[@value='Petrol']")
	private WebElement TypeOfFuel;
	
	@FindBy(xpath = "(//i[@class='fa fa-search'])[3]")
	private WebElement SearchCar;
	
	@FindBy(xpath = "(//a[contains(text(),'View Details')]|//button[contains(text(),'View Details')])[1]")
	private WebElement SelectCar;
	
	@FindBy(linkText = "Accessories")
	private WebElement Accessories;
	
	//Create Constructor
	public CarListing(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getBrand() {
		return Brand;
	}

	public WebElement getFuelType() {
		return FuelType;
	}

	public WebElement getCarBrand() {
		return CarBrand;
	}

	public WebElement getTypeOfFuel() {
		return TypeOfFuel;
	}

	public WebElement getSearchCar() {
		return SearchCar;
	}

	public WebElement getSelectCar() {
		return SelectCar;
	}

	public WebElement getAccessories() {
		return Accessories;
	}
	
	
	
}
