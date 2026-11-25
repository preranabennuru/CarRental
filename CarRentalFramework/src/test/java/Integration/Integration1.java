package Integration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.carbookin.BaseTest.BaseClass;

public class Integration1 extends BaseClass{
	/*public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.get("http://49.249.29.4:8081/TestServer/Build/Car_Rental_Project/");
		FileInputStream fis=new FileInputStream("C:\\Users\\Bharathi PC\\OneDrive\\Desktop\\data\\CarRental.properties");
		
		Properties pObj=new Properties();
		pObj.load(fis);
		
		String BROWSER=pObj.getProperty("browser");
		String URL=pObj.getProperty("url");
		driver.get(URL);*/
	@Test(groups="Integration")
	public void test() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//a[text()='Login / Register']")).click();
		driver.findElement(By.xpath("//a[text()='Signup Here']")).click();
		
	
		driver.findElement(By.xpath("//input[@name=\"fullname\"]")).sendKeys("PRERANA");
		driver.findElement(By.xpath("//input[@name='mobileno']")).sendKeys("123445785");
		Thread.sleep(1000);
		driver.findElement(By.id("emailid")).sendKeys("priy23@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Sign Up']/ancestor::div[@class='modal-content']/descendant::input[@name='password']")).sendKeys("pri1234");
		driver.findElement(By.xpath("//h3[text()='Sign Up']/ancestor::div[@class='modal-content']/descendant::input[@name='confirmpassword']")).sendKeys("pri1234");
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\Bharathi PC\\OneDrive\\Desktop\\data\\CarRental.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		Sheet sh=wb.getSheet("CarRental");
		Row row=sh.getRow(1);
		String Name=row.getCell(2).toString();
		Random random=new Random();
		int randomInt=random.nextInt(1000);
		//wb.close();
		driver.findElement(By.xpath("//input[@name=\"fullname\"]")).sendKeys(Name);
		String Phno=row.getCell(3).toString();
		driver.findElement(By.xpath("//input[@name='mobileno']")).sendKeys(Phno);
		String Email=row.getCell(4).toString() + randomInt + "@gmail.com";
		driver.findElement(By.id("emailid")).sendKeys(Email);
		String password=row.getCell(5).toString();
		driver.findElement(By.xpath("//h3[text()='Sign Up']/ancestor::div[@class='modal-content']/descendant::input[@name='password']")).sendKeys(password);
		String Confirmpass=row.getCell(6).toString();
		driver.findElement(By.xpath("//h3[text()='Sign Up']/ancestor::div[@class='modal-content']/descendant::input[@name='confirmpassword']")).sendKeys(Confirmpass);
		
		//Read data from Excel file
		
		driver.findElement(By.xpath("(//input[@name='signup'])")).click();
		Alert ale=driver.switchTo().alert();
		ale.accept();
		System.out.println("Alert was handled successfully");
		driver.findElement(By.xpath("//a[text()='Login / Register']")).click();
		Thread.sleep(1000);
		
		
		Row row1=sh.getRow(2);
		String LogName=row1.getCell(4).toString();
		driver.findElement(By.xpath("//h3[text()='Login']/ancestor::div[@class='modal-content']/descendant::input[@name='email']")).sendKeys(LogName);
		String Logpass=row.getCell(5).toString();
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(Logpass);
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	

}
