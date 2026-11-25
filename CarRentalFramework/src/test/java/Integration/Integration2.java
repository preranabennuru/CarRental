package Integration;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.car.objectrepository.AdminLoginPage;
import com.car.objectrepository.AdminLogoutPage;
import com.car.objectrepository.DashboardPage;
import com.car.objectrepository.HomePage;
import com.car.objectrepository.TotalBookingDetails;
import com.carbookin.BaseTest.BaseClass;

public class Integration2 extends BaseClass {
	
	@Test(groups="Integration")
	public void test() throws InterruptedException, IOException {
	/*public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://49.249.29.4:8081/TestServer/Build/Car_Rental_Project/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(1000);
		/*FileInputStream fis=new FileInputStream("C:\\Users\\Bharathi PC\\OneDrive\\Desktop\\data\\CarRental.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String BROWSER=pObj.getProperty("browser");
		String URL=pObj.getProperty("url");
		driver.get(URL);*/
		
		

		Actions action=new Actions(driver);
		Thread.sleep(2000);
		WebElement myaccnt=driver.findElement(By.linkText("Admin Login"));
		action.scrollToElement(myaccnt).perform();
		//driver.findElement(By.xpath("//a[text()='Admin Login']")).click();
		HomePage hp = new HomePage(driver);
		hp.getAdminLoginLink().click();
		
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("password")).sendKeys("Test@12345");
		String USERNAME=futil.getDataFromPropertiesFileForAdmin("username");
		String PASSWORD=futil.getDataFromPropertiesFileForAdmin("password");
		AdminLoginPage alp=new AdminLoginPage(driver);
		alp.loginAsAdmin(USERNAME, PASSWORD);
		
		
		
		/*FileInputStream fis1=new FileInputStream("C:\\Users\\Bharathi PC\\OneDrive\\Desktop\\data\\CarRental.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		Sheet sh=wb.getSheet("CarRental");
		Row row=sh.getRow(3);
		String AName=row.getCell(2).toString();
		driver.findElement(By.name("username")).sendKeys(AName);
		String Apass=row.getCell(5).toString();
		driver.findElement(By.name("password")).sendKeys(Apass);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		Thread.sleep(1000);*/
		
		//driver.findElement(By.xpath("//div[text()='Total Bookings']/ancestor::div[@class='panel panel-default']/descendant::a[@class='block-anchor panel-footer text-center']")).click();
	
		DashboardPage db=new DashboardPage(driver);
		db.getBookingDetails().click();
		
		//driver.findElement(By.linkText("Confirm")).click();
		
		TotalBookingDetails tbd=new TotalBookingDetails(driver);
		tbd.getConfirm().click();
		
		
		Alert ale=driver.switchTo().alert();
		ale.accept();
		System.out.println("Alert was handled successfully");
		Actions action1=new Actions(driver);
		WebElement account=driver.findElement(By.linkText("Account"));
		action1.moveToElement(account).build().perform();
		AdminLogoutPage alot=new AdminLogoutPage(driver);
		alot.getAdminLogout().click();
				
		//driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.linkText("Back to Home")).click();
		
		alp.getBackToHome().click();
		Object futil;
		//driver.findElement(By.xpath("//a[text()='Login / Register']")).click();
		hp.getLoginOrRegister().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[text()='Login']/ancestor::div[@class='modal-content']/descendant::input[@name='email']")).sendKeys("preranabennuru@gmail.com");
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("Prer@123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		//LoginPage lp=new LoginPage(driver);
		//lp.loginToApp(USERMAIL, PASSWORD);

		Random random=new Random();
		int randomInt=random.nextInt(1000);
		
		
		/*Row row1=sh.getRow(2);
		String LogEmail=row.getCell(4).toString();
		driver.findElement(By.xpath("//h3[text()='Login']/ancestor::div[@class='modal-content']/descendant::input[@name='email']")).sendKeys(LogEmail);
		String Logpass=row.getCell(5).toString();
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(Logpass);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		*/
		
		driver.findElement(By.xpath("//li[@class='dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='My Booking']")).click();
		
	}

}
