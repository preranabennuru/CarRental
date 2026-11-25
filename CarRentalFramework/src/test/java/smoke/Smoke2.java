package smoke;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.car.objectrepository.HomePage;
import com.carbookin.BaseTest.BaseClass;

public class Smoke2 extends BaseClass {
	@Test(groups="Smoke")
	public void test() throws InterruptedException {
	/*public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("http://49.249.29.4:8081/TestServer/Build/Car_Rental_Project/");
		FileInputStream fis=new FileInputStream("C:\\Users\\Bharathi PC\\OneDrive\\Desktop\\data\\CarRental.properties");
		
		Properties pObj=new Properties();
		pObj.load(fis);
		
		String BROWSER=pObj.getProperty("browser");
		String URL=pObj.getProperty("url");
		driver.get(URL);*/
		HomePage hp=new HomePage(driver);
		hp.getAboutUS().click();
		
		//driver.findElement(By.xpath("//a[text()='About Us']")).click();
	}

}
