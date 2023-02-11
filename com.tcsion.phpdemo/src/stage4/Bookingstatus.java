package stage4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;



public class Bookingstatus extends Baseclass_supplier {
	
	
	
	@Test
	public void Homepage_modules() throws Exception {
	
		driver.findElement(By.xpath("//*[@data-bs-target='#toursmodule']")).click();
		Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@data-bs-target='#Tours']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@href='https://phptravels.net/api/supplier/tours']")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("window.scroll(0,200)");
      Thread.sleep(3000);
      js.executeScript("window.scroll(0,-200)");
      Thread.sleep(3000);
	
	
	}
	
	@Test
	public void change_bookingstatus() throws Exception {
		//MyScreenRecorder.startRecording("Bookingstab-Supplier");
		WebElement bookingstab =  driver.findElement(By.xpath("//*[@href='https://phptravels.net/api/supplier/bookings' and @class='nav-link loadeffect' ]"));
		bookingstab.click();
		Thread.sleep(3000);
		
		//MyScreenRecorder.stopRecording();
	}

}
