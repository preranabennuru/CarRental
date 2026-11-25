package System;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.car.objectrepository.AdminLoginPage;
import com.car.objectrepository.CarListing;
import com.car.objectrepository.CreateBrandPage;
import com.car.objectrepository.DashboardPage;
import com.car.objectrepository.HomePage;
import com.carbookin.BaseTest.BaseClass;

public class SystemTesting1 extends BaseClass {
	@Test
	public void test() throws InterruptedException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getAdminLoginLink().click();
		String USERNAME=futil.getDataFromPropertiesFileForAdmin("username");
		String PASSWORD=futil.getDataFromPropertiesFileForAdmin("password");
		AdminLoginPage alp=new AdminLoginPage(driver);
		alp.loginAsAdmin(USERNAME, PASSWORD);
		//WebDriver driver = new ChromeDriver();
	   /*public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://49.249.29.4:8081/TestServer/Build/Car_Rental_Project/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Thread.sleep(1000);*/
		//Actions action=new Actions(driver);
		Thread.sleep(2000);
		//WebElement myaccnt=driver.findElement(By.linkText("Admin Login"));
		//action.scrollToElement(myaccnt).perform();
		//driver.findElement(By.xpath("//a[text()='Admin Login']")).click();
//HomePage hp = new HomePage(driver);
//hp.getAdminLoginLink().click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("Test@12345");
//		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		DashboardPage db=new DashboardPage(driver);
		db.getAdminBrand().click();
		db.getCreateBrand().click();
		
		CarListing cl=new CarListing(driver);
		
		
		 
		
		
		
		
		
//		driver.findElement(By.linkText("Brands")).click();
//		driver.findElement(By.linkText("Create Brand")).click();
//		driver.findElement(By.id("brand")).sendKeys("Hyunda");
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Brands")).click();
		CreateBrandPage cbp=new CreateBrandPage(driver);
		cbp.getAdminBrandName().sendKeys("Hyundai");
		cbp.getBrandSubmit().click();
		
		
		cbp.getAdminBrandName().sendKeys("Skoda");
		cbp.getBrandSubmit().click();
		Thread.sleep(2000);
		cbp.AdminLogOut();
		
		hp.getCarListing().click();
		
		cl.getBrand().click();
		
		cl.getCarBrand().click();
		
		cl.getTypeOfFuel().click();
		
		cl.getSearchCar().click();
		
		cl.getSelectCar().click();
		
		cl.getAccessories().click();
		
		
		
		
//		driver.findElement(By.linkText("Manage Brands")).click();
//		driver.findElement(By.xpath("//td[text()='Hyunda']/parent::tr[@class='odd']/descendant::i[@class='fa fa-close']")).click();
//		Alert ale=driver.switchTo().alert();
//		ale.accept();
//		System.out.println("Alert was handled successfully");
//		driver.findElement(By.linkText("Dashboard")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Listed Brands']/ancestor::div[@class='panel panel-default']/descendant::a[@class='block-anchor panel-footer text-center']")).click();
//		driver.findElement(By.linkText("Brands")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Create Brand")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("brand")).sendKeys("Hyunda");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		driver.findElement(By.xpath("//td[text()='Hyundai']/parent::tr[@class='odd']/descendant::i[@class='fa fa-close']")).click();
//		Alert al=driver.switchTo().alert();
//		al.accept();
//		System.out.println("Alert was handled successfully");
//		driver.findElement(By.linkText("Dashboard")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Listed Brands']/ancestor::div[@class='panel panel-default']/descendant::a[@class='block-anchor panel-footer text-center']")).click();
//		driver.findElement(By.xpath("//td[text()='Hyunda']/parent::tr[@class='odd']/descendant::i[@class='fa fa-edit']")).click();
//		driver.findElement(By.id("brand")).sendKeys("i");
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Manage Pages")).click();
//		Thread.sleep(2000);
//		WebElement view=driver.findElement(By.xpath("//select[@name='menu1']"));
//		Select obj=new Select(view);
//		obj.selectByValue("manage-pages.php?type=faqs");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class=\" nicEdit-main \"]")).sendKeys("Can I add an additional driver to my reservation?");
//		Actions action1=new Actions(driver);
//		WebElement account=driver.findElement(By.linkText("Account"));
//		action1.moveToElement(account).build().perform();
//		driver.findElement(By.linkText("Logout")).click();
//		
//		
//		
	}
	

}
