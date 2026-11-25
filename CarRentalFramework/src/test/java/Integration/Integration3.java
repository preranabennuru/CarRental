package Integration;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.car.objectrepository.AdminLoginPage;
import com.car.objectrepository.DashboardPage;
import com.car.objectrepository.HomePage;
import com.carbookin.BaseTest.BaseClass;

public class Integration3 extends BaseClass {
	/*public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://49.249.29.4:8081/TestServer/Build/Car_Rental_Project/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		FileInputStream fis=new FileInputStream("C:\\Users\\Bharathi PC\\OneDrive\\Desktop\\data\\CarRental.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		
		String BROWSER=pObj.getProperty("browser");
		String URL=pObj.getProperty("url");
		driver.get(URL);*/
	@Test(groups="Integration")
	public void test() throws InterruptedException, IOException {
		
		
	
		Actions action=new Actions(driver);
		HomePage hp=new HomePage(driver);
		hp.getSubscribe().click();
		
		
		hp.subscribeemail("abc@gmail.com");
		hp.getEmailSubscribe().click();
		
		Alert ale=driver.switchTo().alert();
		ale.dismiss();
		System.out.println("Alert was handled successfully");
		
		hp.getAdminLoginLink().click();
		String USERNAME=futil.getDataFromPropertiesFileForAdmin("username");
		String PASSWORD=futil.getDataFromPropertiesFileForAdmin("password");
		AdminLoginPage alp=new AdminLoginPage(driver);
		alp.loginAsAdmin(USERNAME, PASSWORD);
		
		DashboardPage dbp=new DashboardPage(driver);
		dbp.getSubscribersDetails().click();
		
		
		/*driver.findElement(By.xpath("//button[@name='emailsubscibe']")).click();
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\Bharathi PC\\OneDrive\\Desktop\\data\\CarRental.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		Sheet sh=wb.getSheet("CarRental");
		Row row=sh.getRow(4);
		Random random=new Random();
		int randomInt=random.nextInt(1000);
		String Email=row.getCell(4).toString()+randomInt+"@gmail.com";
		driver.findElement(By.xpath("//input[@name='subscriberemail']")).sendKeys(Email);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-angle-right']")).click();
		Thread.sleep(1000);
		
		Alert ale=driver.switchTo().alert();
		ale.dismiss();
		System.out.println("Alert was handled successfully");
		
		WebElement myaccn=driver.findElement(By.xpath("//a[text()='Admin Login']"));
		action.scrollToElement(myaccn).perform();
		driver.findElement(By.linkText("Admin Login")).click();
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("password")).sendKeys("Test@12345");
		
		Row row1=sh.getRow(3);
		String AName=row1.getCell(2).toString();
		driver.findElement(By.name("username")).sendKeys(AName);
		String Apass=row1.getCell(5).toString();
		driver.findElement(By.name("password")).sendKeys(Apass);
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		driver.findElement(By.xpath("//div[text()='Subscibers']/ancestor::div[@class='panel panel-default']/descendant::a[@class='block-anchor panel-footer']")).click();
		*/
	}

}
