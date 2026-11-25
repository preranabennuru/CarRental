package System;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.carbookin.BaseTest.BaseClass;

public class SystemTesting2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://49.249.29.4:8081/TestServer/Build/Car_Rental_Project/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		WebElement myaccnt=driver.findElement(By.linkText("Admin Login"));
		action.scrollToElement(myaccnt).perform();
		driver.findElement(By.xpath("//a[text()='Admin Login']")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		driver.findElement(By.xpath("//div[text()='Subscibers']/ancestor::div[@class='panel panel-default']/descendant::a[@class='block-anchor panel-footer']")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-close'])[1]")).click();
		Thread.sleep(1000);
		Alert ale=driver.switchTo().alert();
		ale.dismiss();
		System.out.println("Alert was handled successfully");
		Actions action1=new Actions(driver);
		WebElement account=driver.findElement(By.linkText("Account"));
		action1.moveToElement(account).build().perform();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
