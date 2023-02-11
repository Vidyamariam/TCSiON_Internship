package stage2;

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

public class Baseclass_agent {
	
	public WebDriver driver;
	
	String baseurl = "https://phptravels.net/login";
	
	@BeforeTest
	public void openBrowser() {
		
		String driverPath = System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	@Test 
	public void LaunchApp() throws InterruptedException {
		
		driver.get(baseurl);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder = 'Email']"));
		username.sendKeys("agent@phptravels.com");
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
		pass.sendKeys("demoagent");
		WebElement clickLogin = driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']"));
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
		{"agent@phptravels.com","demoagent"},{"abc@phptravels", "abc456"},
		{"agent@phptravels.com", "def456"}, {"pqr@gmsil.com", "demoagent"},{" ", " "}
		
		     
			};

}*/
	
	
}
