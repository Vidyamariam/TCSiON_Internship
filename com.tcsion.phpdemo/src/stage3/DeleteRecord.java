package stage3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class DeleteRecord extends Baseclass_admin {
	
	
	@Test
	public void deleteRecord() throws InterruptedException {
		
		WebElement bookings_link = driver.findElement
				(By.xpath("//a[@class='loadeffect nav-link collapsed mdc-ripple-upgraded' and@href='https://phptravels.net/api/admin/bookings']"));
        bookings_link.click();
        Thread.sleep(3000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("window.scroll(0,800)");
     Thread.sleep(3000);
    WebElement delete_booking = driver.findElement(By.xpath
     		("//button[@class='btn btn-danger mdc-ripple-upgraded' and @onclick='del(\"1\" , \"flights\")']"));
    // delete_booking.click();
	js.executeScript("arguments[0].click();", delete_booking );
	Thread.sleep(3000);
	
	}
	
	
}
