package stage1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import screenRecorder.MyScreenRecorder;

public class Baseclass_user {
	
	public WebDriver driver;
	
	
	String baseurl = "https://phptravels.net/login";
	
	@BeforeTest
	public void openBrowser() throws Exception {
		//MyScreenRecorder.startRecording("open browser");
		String driverPath = System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//MyScreenRecorder.stopRecording();
	}
	
		
	@Test 
	public void LaunchApp() throws InterruptedException {
		
		driver.get(baseurl);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder = 'Email']"));
		
		username.sendKeys("user@phptravels.com");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
		pass.sendKeys("demouser");
		Thread.sleep(2000);
		WebElement clickLogin = driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']"));
		clickLogin.click();
		Thread.sleep(2000);
	
	}
	
	@AfterTest
    public void closeBrowser() {
		
		driver.close();
	}
	
	

}
