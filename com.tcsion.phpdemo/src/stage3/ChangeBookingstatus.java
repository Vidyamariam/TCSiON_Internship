package stage3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeBookingstatus extends Baseclass_admin {
	
	@Test
	public void Statuschange() throws InterruptedException {
		
		WebElement bookings_link = driver.findElement
				(By.xpath("//a[@class='loadeffect nav-link collapsed mdc-ripple-upgraded' and@href='https://phptravels.net/api/admin/bookings']"));
        bookings_link.click();
        Thread.sleep(3000);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,800)");
        driver.findElement(By.xpath("//*[text()='7' and @class='xcrud-current xcrud-num sorting_1']")).isSelected();
        //Assert.assertTrue(indexno, "The element is selected");
        
        WebElement ddown = driver.findElement(By.id("booking_status"));
        Thread.sleep(3000);
    	js.executeScript("document.getElementById('booking_status').click()" );
        Thread.sleep(3000);
        Select se = new Select(ddown);
        se.selectByVisibleText("2,flights,Pending");
        Thread.sleep(3000);
        
	}
	
	/*@Test
	public void websitelink_verify() throws InterruptedException {
		
		
		WebElement weblink = driver.findElement(By.xpath("//*[text()='Website']"));
		weblink.click();
		
		//Assert.assertEquals(weblink, "The website link is enabled");
		
	}*/


}
