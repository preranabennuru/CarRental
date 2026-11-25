package System;

import org.testng.annotations.Test;

import com.car.objectrepository.HomePage;
import com.car.objectrepository.LoginPage;
import com.carbookin.BaseTest.BaseClass;

public class SystemTesting extends BaseClass{
	@Test
	
	public void test() throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
		/*driver.get("http://49.249.29.4:8081/TestServer/Build/Car_Rental_Project/");
		driver.findElement(By.xpath("//a[text()='Login / Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[text()='Login']/ancestor::div[@class='modal-content']/descendant::input[@name='email']")).sendKeys("preranabennuru@gmail.com");
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("Prer@123");
		driver.findElement(By.xpath("//input[@name='login']")).click();*/
//		driver.findElement(By.linkText("About Us")).click();
		
		HomePage hp = new HomePage(driver);
		hp.getAboutUS().click();
		
//		driver.findElement(By.xpath("//input[@name=\"searchdata\"]")).sendKeys("BMW 5 series");
		Thread.sleep(1000);
		System.out.println("qqqqqqq");
//		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//		driver.findElement(By.linkText("View Details")).click();
//		Thread.sleep(10000);
//		//driver.findElement(By.xpath("//input[@name='fromdate']")).click();
//		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("I want this vehicle");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//input[@class='btn']")).click();
//		Alert ale=driver.switchTo().alert();
//		ale.accept();
//		System.out.println("Alert was handled successfully");
//		driver.findElement(By.xpath("//a[text()='Admin Login']")).click();
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("Test@12345");
//		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
//		driver.findElement(By.xpath("//div[text()='Total Bookings']/ancestor::div[@class='panel panel-default']/descendant::a[@class='block-anchor panel-footer text-center']")).click();
//		
	}

}
