package stage3;

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

public class Baseclass_admin {
	
public static WebDriver driver;
	
	String baseurl = "https://phptravels.net/api/admin";
	
	@BeforeTest
	public void open_Browser()
	{
		String driverPath = System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@Test
	public void LaunchApp() throws InterruptedException {

		
		driver.get(baseurl);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=' ' and @name='email']"));
		username.sendKeys("admin@phptravels.com");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
		pass.sendKeys("demoadmin");
		Thread.sleep(3000);
		WebElement clickLogin = driver.findElement(By.xpath("//button[@type='submit' and @data-style='zoom-in']"));
		clickLogin.click();
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.close();
		
	}
	
	
	
	
	/*@DataProvider(name = "scenario")
	public Object[][] dataset()
{
	return new Object[][]
			{
		{"admin@phptravels.com","demoadmin"},{"abc@phptravels", "abc456"},
		{"admin@phptravels.com", "def456"}, {"pqr@gmsil.com", "demoadmin"},{" ", " "}
		
		     
			};

}*/
	
	

}

     
