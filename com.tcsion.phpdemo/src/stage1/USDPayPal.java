package stage1;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class USDPayPal extends Baseclass_user{

      
	
	
	@Test 
	public void USDpaypal_payment() throws InterruptedException
	{
		
		driver.findElement(By.xpath
				("//a[@href='https://phptravels.net/account/add_funds' and @class = ' waves-effect']")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='gateway_paypal']")).click();
	    System.out.println("click paypal radio button");
		Thread.sleep(3000);
		driver.findElement(By.xpath
				("//button[@class='btn btn-primary btn-block btn-lg my-3 waves-effect']")).click();
		System.out.println("click paynow button");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='paypal-button-label-container']")).click();
		System.out.println("click paypal tab");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("3645782936");
		System.out.println("entered details in email field");
		Thread.sleep(3000);
		driver.findElement(By.xpath
				("//button[@class='button actionContinue scTrack:unifiedlogin-login-click-next']")).click();
		System.out.println("click continue tab");
		Thread.sleep(3000);
	
		
	}
	
}
