package stage1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class DisplayVoucher extends Baseclass_user {
	
   @Test
   public void display_voucher() throws InterruptedException {
	   
	   driver.findElement(By.xpath
			   ("//a[@href ='https://phptravels.net/account/bookings' and @class = ' waves-effect']")).click();
	   System.out.println("click Bookings tab");
	   Thread.sleep(3000);
	   JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scroll(0,500)");
       Thread.sleep(3000);
       
       driver.findElement(By.xpath
    		   ("//*[@href='https://phptravels.net/hotels/booking/invoice/1574/19']")).click();
       System.out.println("click on View Voucher option");
       Thread.sleep(3000);
       js.executeScript("window.scroll(0,500)");
       Thread.sleep(3000);
       
	   
	   
   }

}
