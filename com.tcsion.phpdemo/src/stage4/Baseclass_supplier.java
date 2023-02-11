package stage4;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Baseclass_supplier {
	
public static WebDriver driver;
	
	String baseurl = "https://phptravels.net/api/supplier";
	
	@BeforeTest 
    public void open_Browser() throws Exception
	{
		String driverPath = System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
	
		
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	  
	@Test
	public void SupplierLogin() throws Exception  {
		
		driver.get(baseurl);
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email' and @placeholder=' ']"));
		username.sendKeys("supplier@phptravels.com");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password' and @placeholder=' ']"));
		pass.sendKeys("demosupplier");
		Thread.sleep(3000);
		WebElement clickLogin = driver.findElement(By.xpath("//button[@type='submit' and @data-style='zoom-in']"));
		clickLogin.click();
		Thread.sleep(3000);
		
		
	}
	
	/*@DataProvider(name = "scenario")
		public Object[][] dataset()
	{
		return new Object[][]
				{
			{"supplier@phptravels.com","demosupplier"},{"abc@phptravels", "abc456"},
			{"supplier@phptravels.com", "def456"}, {"pqr@gmsil.com", "demosupplier"},{" ", " "}
			
			     
				};
	
	}*/
		
	
	
	@AfterTest()
	public void CloseBrowser() throws Exception{
		
		driver.close();
		
	}

}
